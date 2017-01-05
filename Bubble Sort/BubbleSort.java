import java.io.*;
import java.util.*;
public class BubbleSort
{
	public static void main(String[] sArgs)throws IOException
	{
		int[] data = {7, 23, 0, 4, 3 ,8, 21, 14};
		System.out.println("Original :" + Arrays.toString(data));
		System.out.println("Sorted :" + Arrays.toString(bubbleSort(data)));
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