package datastructure.phase1;

import java.util.Arrays;

public class fourthsmallest1
{
	
		public static int kthSmallest(Integer[] arr,
									int k)
		{
		
			Arrays.sort(arr);
			
			return arr[k - 1];
		}

		public static void main(String[] args)
		{
			Integer arr[] = new Integer[] { 10, 4, 6, 7, 21 };
			int k = 4;
			System.out.print("K'th smallest element is " + kthSmallest(arr, k));
		}
	}

	