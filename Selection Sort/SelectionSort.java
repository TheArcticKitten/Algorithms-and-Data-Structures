import java.io.*;
import java.util.*;
public class SelectionSort
{
	public static void main(String[] sArgs)throws IOException
	{
		int size = 1000;
		int[] data = new int[size]; Random oRan = new Random();
		for(int i = 0; i < data.length;i++)data[i] = oRan.nextInt(100); 
		System.out.println("Original :" + Arrays.toString(data));
		long start = System.currentTimeMillis();
		int[] sorted = selectionSort(data);
		long end = System.currentTimeMillis();
		System.out.println("Data Sorted in " + (end - start) + " milliseconds :" + Arrays.toString(sorted));
	}

	public static int[] selectionSort(int[] nums)
	{

		for(int i = 0; i < nums.length; i++)
		{
			int min = Integer.MAX_VALUE;
			int indMin = -1;
			for(int j = i; j < nums.length; j++)
			{
				if(nums[j] < min)
				{
					indMin = j;
					min = nums[j];
				}
			}

			int temp = nums[i];
			nums[i] = nums[indMin];
			nums[indMin] = temp;
		}

		return nums;
	}
}