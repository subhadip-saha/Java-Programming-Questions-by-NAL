//Question 2: Print 1 to 100 Without Using Any Loop in Code using recursive function and java streams.

package tricky_java_questions;

import java.util.stream.IntStream;

public class NAL2_Print1to100WithoutUsingLoop {

	//Approach 1: using recursion
	
	//Method 1: 
	/*public static void printNumbers(int num)
	{
		if(num == 101)				//base case
			return;
		
		System.out.println(num);	//print
		
		printNumbers(num + 1);		//recursion, as it is increasing by 1 at each step, so n+1
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1;
		printNumbers(num);
	}*/
	
	
	//Method 2: Hardcoding the value
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int num = 1;
		//printNumbers(num);
		
		//printNumbers fn. we can call it directly from main() without creating object because it is static method
		//directly write
		printNumbers(1);		//number starts from 1
	}
	
	public static void printNumbers(int num)
	{
		//print when number is < 100
		if(num <= 100)				
		{
			System.out.println(num);
			num++;
			printNumbers(num);
		}		

	}*/
	

	
	
	//Method 3: here we want to give a specific range, not hardcoding like print from 1 to 100
	
	/*public static void main(String[] args) 
	{
	// TODO Auto-generated method stub	
		printNumbers(1, 100);		//number starts from 1 and ends at 100
	}
	
	public static void printNumbers(int startingNum, int endingNum)
	{
		//print when number is < 100
		if(startingNum <= endingNum)				
		{
			System.out.println(startingNum);
			startingNum++;
			printNumbers(startingNum, endingNum);
		}		

	}*/
	
	
	//Approach 2: using java streams (integer streams)
	
	public static void main(String[] args) 
	{
	// TODO Auto-generated method stub	
		IntStream.range(1, 101).forEach(e -> System.out.println(e));	// -> lambda expression
		//this prints 1 to 100, not 101
	}

}
