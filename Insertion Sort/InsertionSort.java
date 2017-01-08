import java.io.*;
import java.util.*;
public class InsertionSort
{
	public static void main(String[] sArgs)throws IOException
	{
		int size = 10;
		int[] data = new int[size]; Random oRan = new Random();
		for(int i = 0; i < data.length;i++)data[i] = oRan.nextInt(size); 
		System.out.println("Original :" + Arrays.toString(data));
		long start = System.currentTimeMillis();
		int[] sorted = insertionSort(data);
		long end = System.currentTimeMillis();
		System.out.println("Data Sorted in " + (end - start) + " milliseconds :" + Arrays.toString(sorted));
	}

	public static int[] insertionSort(int[] nums)
	{
		for(int i = 1; i < nums.length; i++)
		{
			out:
			for(int j = i; j > 0;j--)
			{
				if(nums[j] < nums[j-1])//if less than one next to it
				{
					int temp = nums[j];
					nums[j] = nums[j-1];
					nums[j-1] = temp;
				}
				else break out;
			}
		}

		return nums;
	}
}