// Question : Compare Two Integer Numbers (Integer Caching) in #Java

package tricky_java_questions;

public class NAL5_CompareTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Here we are comparing references - Integer wrapper class  
		//Generally in Java, the comparsion b/w two object references with the help of == always gives false  
		//both the numbers are autoboxed, so they take actual values and then comparison happens
		//if numbers are 100 then it gives both are equal but  for 190 it gives both are not equal
		
		//Reason is: Integer Caching. Range is: -128 to +127
		
		Integer num1 = 128;
		Integer num2 = 128;
		
		if(num1 == num2)
			System.out.println("Both are equal");
		else
			System.out.println("Both are not equal");
	}

}
