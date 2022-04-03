//Question: What will be the output when you divide a number by zero?
// Must read: https://javarevisited.blogspot.com/2016/05/difference-between-float-and-double-in-java.html#axzz7Oznfutdq

package tricky_java_questions;

public class NAL7_DivideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Number might be Integer, Double, Float
		
		//if a number is integer - / by 0 gives arithmetic exception
		//System.out.println(9 / 0);		//java.lang.ArithmeticException: / by zero
		//System.out.println(0 / 0);			//java.lang.ArithmeticException: / by zero
		
		
		//0 is integer number, 0.0 is floating point number
		
		System.out.println(0.0 / 0);		//NaN
		System.out.println(0.0 / 0.0);		//NaN	// NaN is defined in Double class
		System.out.println(0 / 0.0);		//NaN
		
		//if a number is double or float - / by 0 or 0.0 gives infinity always
	
		System.out.println(9.0 / 0);			//Infinity
		
		//f suffix = float
		System.out.println(12.33f / 0);			//Infinity
		System.out.println(12.33f / 0.0);		//Infinity
		
		System.out.println(10 / 0.0);			//Infinity
		
		//d suffix = double
		System.out.println(19.999999d / 0);			//Infinity
		System.out.println(19.999999d / 0.0);		//Infinity
		
		System.out.println(12.33 / 0.0);		//Infinity
		System.out.println(0.0 / 12.33);		//0.0
		
	//Conclusion: arithmetic exception occurs only with integer, not with floating point numbers.	
	}

}
