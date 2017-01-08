import java.io.*;
import java.util.*;
public class BinarySearch
{
	public static void main(String[] sArgs)throws IOException
	{
		int size = 10000;
		int searchVal = 478;
		int[] data = new int[size]; Random oRan = new Random();
		for(int i = 0; i < data.length;i++)data[i] = oRan.nextInt(1000); 
		Arrays.sort(data);
		long start = System.currentTimeMillis();
		int index = binSearch(data, searchVal);
		long end = System.currentTimeMillis();
		if(index != -1)System.out.println("Searched for " + searchVal +" and found at index " + index + " in " + (end - start) + " milliseconds. data[" + index + "] = " + data[index]);
		else System.out.println("Value not found in current data set.");
	}

	public static int binSearch(int[] nums, int val)
	{
		int lower = 0; int upper = nums.length-1;
		int index = -1;
		while(upper >= lower)
		{
			int middle = (upper + lower)/2;

			if(nums[middle] == val)
			{
				return middle;
			}

			if(nums[middle] > val)
			{
				upper = middle - 1;
			}
			else lower = middle + 1;
		}

		return -1;
	}
}