import java.io.*;
import java.util.*;
public class Queue
{
	public static void main(String[] sArgs)throws IOException
	{
		QueueStruct<Integer> oStruct = new QueueStruct<Integer>();
		oStruct.add(3);
		oStruct.add(4);
		System.out.println("Size: " + oStruct.size());
		System.out.println("Peek: " + oStruct.peek());
		System.out.println("Structure: " + oStruct.toString());
		System.out.println("Poll: " + oStruct.poll());
		System.out.println("Structure: " + oStruct.toString());
		System.out.println("Poll: " + oStruct.poll());
		System.out.println("Structure: " + oStruct.toString());
		System.out.println("Poll: " + oStruct.poll());
		System.out.println("Peek: " + oStruct.peek());
	}
}

class QueueStruct<E>
{

	E[] elements;

	public QueueStruct()
	{
		elements = (E[]) new Object[0];
	}

	public boolean add(E e)
	{
		E[] newAry = (E[]) new Object[elements.length + 1];
		newAry[0] = e;
		for(int i = 1; i < elements.length + 1; i++)newAry[i] = elements[i-1];
		elements = newAry;
		//System.out.println("Add: " + Arrays.toString(elements));
		return true;
	}

	public E peek()
	{
		//System.out.println("Peek: " + elements[elements.length - 1]);
		if(elements.length != 0)return elements[elements.length - 1];
		else return null;
	}

	public E poll()
	{
		if(elements.length == 0)return null;
		E[] newAry = (E[]) new Object[elements.length - 1];
		E ret = elements[elements.length - 1];
		for(int i = 0; i < elements.length-1; i++)newAry[i] = elements[i];
		elements = newAry;
		return ret;
	}

	public int size()
	{
		return elements.length;
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