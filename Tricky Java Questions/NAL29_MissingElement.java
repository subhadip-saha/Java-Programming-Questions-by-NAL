//Question: Find out the missing number in an integer array

package tricky_java_questions;

public class NAL29_MissingElement {

	public static int findMissingNumber(int arr[], int totalCount)
	{
		//expectedSum means sum with all numbers, including missing number
		int expectedSum = totalCount * ((totalCount + 1)/2);  //summation of first n numbers - n*((n+1)/2)
		
		//actualSum means sum with numbers present in the array (not including missing number)
		int actualSum = 0;	
		for(int value : arr)
			actualSum = actualSum + value;		//actualSum += value;
		
		//their difference will be missing Number
		int missingNum = expectedSum - actualSum;
		return missingNum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//This logic finds only one missing number in an array 
		
		int arr[] = {1,3,2,4};
		int count = arr.length + 1;		//we have to include the missing number
		int n1 = findMissingNumber(arr, 5);
		System.out.println(n1);
		
	}

}
