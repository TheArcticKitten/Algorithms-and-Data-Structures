import java.io.*;
import java.util.*;
public class Stack
{
	public static void main(String[] sArgs)throws IOException
	{
		Stackk<Integer> oStruct = new Stackk<Integer>();
		oStruct.push(3);
		oStruct.push(4);
		System.out.println("Peek: " + oStruct.peek());
		System.out.println("Structure: " + oStruct.toString());
		System.out.println("Poll: " + oStruct.pop());
		System.out.println("Structure: " + oStruct.toString());
		System.out.println("Poll: " + oStruct.pop());
		System.out.println("Structure: " + oStruct.toString());
		System.out.println("Peek: " + oStruct.peek());
	}
}

class Stackk<E>
{
	E[] elements;

	public Stackk()
	{
		elements = (E[]) new Object[0];
	}

	public void push(E e)
	{
		E[] newAry = (E[]) new Object[elements.length + 1];
		newAry[0] = e;
		for(int i = 1; i < elements.length + 1; i++)newAry[i] = elements[i-1];
		elements = newAry;
	}

	public E pop()
	{
		if(elements.length == 0)return null;
		E[] newAry = (E[]) new Object[elements.length - 1];
		E ret = elements[0];
		for(int i = 1; i < elements.length; i++)newAry[i-1] = elements[i];
		elements = newAry;
		return ret;
	}

	public int search(E oE)
	{
		int ret = -1;
		for(int i = 0; i < elements.length; i++)
		{
			if(elements[i] == oE)ret = i;
		}

		return ret;

	}

	public E peek()
	{
		if(elements.length != 0)return elements[0];
		else return null;
	}

	public String toString()
	{
		String sRet = "[";
		for(int i = 0; i < elements.length - 1; i++)sRet += elements[i] + ", ";
		try
		{
			sRet += elements[elements.length-1] + "]";
		}
		catch(Exception e)
		{
			sRet += "]";
		}
		return sRet;
	}
}