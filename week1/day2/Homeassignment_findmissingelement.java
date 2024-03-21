package week1.day2;

import java.util.Arrays;

public class Homeassignment_findmissingelement {

	public static void main(String[] args) {
		
		int[] arr = new int [] {1,4,3,2,8,6,7};
		Arrays.sort(arr);
		int sum1 =0;
		
		for (int i =0; i<arr.length; i++)
		{
			sum1 = sum1+arr[i];
		}
		int sum2 =0;
		
		for (int i = 1; i<=8; i++)
		{
			sum2 = sum2+i;
		}
		
		System.out.println(sum2-sum1);
	}}
