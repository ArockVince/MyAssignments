package week1.day2;

import java.util.Arrays;

public class FindingSmallest {

	public static void main(String[] args) {
		
		int arr[]= {23,45,67,32,89,22};
		Arrays.sort(arr);
		System.out.println("The smallest number is"+ arr[0]);
		System.out.println("The largest number is"+ arr[5]);
		

	}

}
