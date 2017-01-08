import java.io.*;
import java.util.*;
public class LinearSearch
{
	public static void main(String[] sArgs)throws IOException
	{
		int size = 10000;
		int searchVal = 478;
		int[] data = new int[size]; Random oRan = new Random();
		for(int i = 0; i < data.length;i++)data[i] = oRan.nextInt(1000); 
		long start = System.currentTimeMillis();
		int index = linSearch(data, searchVal);
		long end = System.currentTimeMillis();
		if(index != -1)System.out.println("Searched for " + searchVal +" and found at index " + index + " in " + (end - start) + " milliseconds. data[" + index + "] = " + data[index]);
		else System.out.println("Value not found in current data set.");
	}

	public static int linSearch(int[] nums, int val)
	{
		int index = -1;
		out:
		for(int i = 0; i < nums.length; i++)
		{
			if(nums[i] == val)
			{
				index = i;
				break out;
			}
		}
		return index;
	}
}