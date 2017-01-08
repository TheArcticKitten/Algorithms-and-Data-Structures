import java.io.*;
import java.util.*;
public class ArrayList
{
	public static void main(String[] sArgs)throws IOException
	{
		AryList<String> oList = new AryList<String>();
		oList.add("a");oList.add("b"); oList.add("c");
		System.out.println(oList.toString());
		oList.set(2, "d");
		System.out.println(oList.toString());
		oList.add(2, "d");
		System.out.println(oList.toString());
	}
}

class AryList<E>
{
	int iSize;
	Object[] eAry;
	Object E = new Object();
	public AryList()
	{
		iSize = 0;
		eAry = new Object[iSize];
	}

	public AryList(int iN)
	{
		iSize = iN;
	}

	public void add(int iIndex, E oE)
	{
		int z = 0;
		Object[] newAry = new Object[++iSize];
		for(int i = 0; i < eAry.length; i++)
		{
			if(i == iIndex)
			{
				newAry[i] = oE;
				i += 1;
			}
			newAry[i] = eAry[z];
			z += 1;
		}
		eAry = new Object[iSize];
		for(int i = 0; i < newAry.length;i++)eAry[i] = newAry[i];
	}

	public boolean contains(E oE)
	{
		for(int i = 0; i < iSize;i++)
		{
			if(eAry[i] == oE)return true;
		}
		return false;
	}

	public boolean add(E oE)
	{
		Object [] newAry = new Object[++iSize];
		for(int i = 0; i < eAry.length;i++)newAry[i] = eAry[i];//copies old array into new array
		newAry[iSize-1] = oE;//copies the new value into it
		eAry = new Object[iSize];
		for(int i = 0; i < newAry.length;i++)eAry[i] = newAry[i];
		return true;
	}

	public E get(int i)
	{
		
		System.out.println(Arrays.toString(eAry));
		return (E)eAry[i];
	}

	public int size()
	{
		 return iSize;
	}

	public void set(int i, E oE)
	{
		eAry[i] = oE;
	}

	public E remove(int i)
	{
		Object[] newAry = new Object[--iSize];
		E oE = (E)eAry[i];
		int z = 0;
		for(int j = 0; j < eAry.length;j++)
		{
			if(i == j)
			{
				j +=1;
			}
			newAry[z] = (E)eAry[j];
			z += 1;
		}
		eAry = new Object[iSize];
		for(int j = 0; j < newAry.length;j++)eAry[j] = newAry[j];
		return oE;
	}

	public boolean remove(E oEE)
	{
		Object[] newAry = new Object[--iSize];
		boolean bRet = false;
		int z = 0;
		for(int j = 0; j < eAry.length - 1;j++)
		{
			if(eAry[j] == oEE)
			{
				j +=1;
				bRet = true;
			}
			newAry[z] = (E)eAry[j];
			z += 1;
		}
		eAry = new Object[iSize];
		for(int j = 0; j < newAry.length;j++)eAry[j] = newAry[j];
		return bRet;
	}

	public void clear()
	{
		for(int i = 0; i < iSize;i++)eAry[i] = null;
	}

	public int indexOf(E oE)
	{
		for(int i =0;i<eAry.length;i++)
		{
			if(eAry[i] == oE)return i;
		}
		return -1;
	}

	public String toString()
	{
		String sRet = "[";
		for(int i = 0; i < eAry.length - 1; i++)sRet += eAry[i] + ", ";
		try
		{
			sRet += eAry[eAry.length-1] + "]";
		}
		catch(Exception e)
		{
			sRet += "]";
		}
		return sRet;
	}
}