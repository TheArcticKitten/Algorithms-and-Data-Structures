import java.io.*;
import java.util.*;
public class BubbleSort
{
	public static void main(String[] sArgs)throws IOException
	{
		int size = 10000;
		int[] data = new int[size]; Random oRan = new Random();
		for(int i = 0; i < data.length;i++)data[i] = oRan.nextInt(size); 
		System.out.println("Original :" + Arrays.toString(data));
		long start = System.currentTimeMillis();
		int[] sorted = bubbleSort(data);
		long end = System.currentTimeMillis();
		System.out.println("Data Sorted in " + (end - start) + " milliseconds :" + Arrays.toString(sorted));
	}

	public static int[] bubbleSort(int[] nums)
	{
		boolean swapped = true;
		while(swapped)
		{
			swapped = false;
			for(int i = nums.length-1; i > 0; i--)
			{
				if(nums[i] < nums[i-1])//if out of order swap
				{
					int temp = nums[i];
					nums[i] = nums[i-1];
					nums[i-1] = temp;
					swapped = true;
				}
				//System.out.println(Arrays.toString(nums));
			}
		}

		return nums;
	}
}