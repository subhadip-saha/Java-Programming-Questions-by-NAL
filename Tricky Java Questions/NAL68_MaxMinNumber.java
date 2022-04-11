/*
 * Find out Max and Min number out of three positive numbers - Quick Trick
 * This will not work if number is negative number and float or double type
 */

package tricky_java_questions;

public class NAL68_MaxMinNumber {

	public static void findMaxNumber(int a, int b, int c) {
		int max = 0;
		while(a > 0 || b > 0 || c > 0) {	//condition for all +ve integers
			a--;
			b--;
			c--;
			max++;
		}
		
		System.out.println("Maximum: " + max);			
	}
	
	public static void findMinNumber(int a, int b, int c) {
		int min = 0;
		while(a > 0 && b > 0 && c > 0) {	//condition for all +ve integers
			a--;
			b--;
			c--;
			min++;
		}
		
		System.out.println("Minimum: " + min);			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//testcases for max
		findMaxNumber(10, 20, 30);
		findMaxNumber(10, 10, 30);
		findMaxNumber(10, 10, 10);
		findMaxNumber(100, 0, 30);
		findMaxNumber(0, 0, 0);
		findMaxNumber(-10, 0, -30);
		findMaxNumber(-10, -20, -30);		//0, it will not work for negative numbers
		
		//testcases for min
		findMinNumber(10, 20, 30);
		findMinNumber(10, 10, 30);
		findMinNumber(10, 10, 10);
		findMinNumber(100, 0, 30);
		findMinNumber(0, 0, 0);
		findMinNumber(-10, 0, -30);
		findMinNumber(-10, -20, -30);		//0,  it will not work for negative numbers
	}

}

//Note: also try with if-else logic