/*
 * Question: What is NaN - Not A Number? How is NaN defined in different languages?
 * 
 * NaN - Not A Number, almost all prog. lang. handles this NaN - a number which is not defined, which 
 * occurred for operations on floating point values like modulus with 0.0, divide by 0.0 or the square 
 * root of negative number like in SQL database to handle such kind of thing we have NULL 
 */

package tricky_java_questions;

public class NAL6_NotANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(2/0);				//java.lang.ArithmeticException: / by zero
		
		System.out.println(2 / 0.0);			//Infinity
		System.out.println(2.0 / 0.0);			//Infinity
		System.out.println(-2 / 0.0);			//-Infinity
		System.out.println(-2.0 / 0.0);			//-Infinity
		
		System.out.println(2 % 0.0);			//NaN
		System.out.println(-2.0 % 0.0);			//NaN
		System.out.println(0.0 / 0.0);	
		System.out.println(0 / 0.0);			//NaN	// NaN is defined in Double class
		System.out.println(0.0 / 0);			//NaN
		
		System.out.println(Math.sqrt(-1));		//NaN
		
		//Generating a NaN
		System.out.println(Float.NaN);			//NaN
		
		// equality operator and non-equality operator returns true or false
		//Both are not a defined number, so cannot be equal. So, false
		System.out.println(Float.NaN == Float.NaN);	//false
		//Both are not a defined number, so ofcourse they are not equal. So, true
		System.out.println(Float.NaN != Float.NaN);	//false
		
		//variable nan
		double nan = 2.1 % 0;
		System.out.println(nan); 	//NaN
		System.out.println((2.1 % 0) == nan);	//false, not defined. so cannot be comapred with equality operator
		//even nan variable cannot be compared with equality operator
		System.out.println(nan == nan); 		//false, We cannot compare two NaN because both of them are undefined numbers
		
		//Same behaviour happens in almost all the programming languages
	}

}
