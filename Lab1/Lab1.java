import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Lab1 {

	public static int howManyCollatz(int n){
		int count = 0;
		while(n != 1){
			if(n % 2 == 0)
				n = n / 2;
			else
				n = n * 3+1;
			count++;
		}
		return count;
	}

	public static String displayNum(int[] nums)
		{
			String blank = "";
			for(int i = 0; i < nums.length; i++) {
				if(!alreadyContained(nums,nums[i],i))
						blank += " " + nums[i];
			}
			return blank;
		}

	public static boolean alreadyContained(int[] arr, int x, int pos)
	{
		for(int i = 0; i < pos; i++)
		{
			if(arr[i]==x)
				return true;
		}
		return false;
	}
	
	public static void getTime()
	{
		int[] nums = new int[100000];
		int key = 50000;
		for(int i = 0;i<100000;i++)
		{
			nums[i] = (int) (Math.random() * 100000);
		}
		Arrays.sort(nums);
		long startTime = System.currentTimeMillis();
		for(int n:nums){
			if(n==key)
				break;
			//System.out.println(n);	
		}
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		System.out.println("Linear Search");
		System.out.println("Start: "+ startTime);
		System.out.println("End: " + endTime);
		long startTime1 = System.currentTimeMillis();
		binarySearch(nums,key);
		long endTime1 = System.currentTimeMillis();
		long executionTime1 = endTime1 - startTime1;
		System.out.println("\nBinary Search");
		System.out.println("Start: "+ startTime1);
		System.out.println("End: " + endTime1);
		
	}
	
	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;
		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < list[mid])
				high = mid - 1;
			else if (key == list[mid])
				return mid;
			else
				low = mid + 1;
		}
		return -1 - low;
	}
	
	public static void main(String[] args)
	{
		System.out.print(howManyCollatz(1212312));
		System.out.println("\n" + displayNum(new int[]{5,6,2,1,7,6,3,4,0,1}));
		getTime();
		
	}
	}
