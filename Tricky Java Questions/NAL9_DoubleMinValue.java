//Question: What is the MIN_VALUE of Double and Float in Java

package tricky_java_questions;

public class NAL9_DoubleMinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //Q. What is the value of Double MIN_VALUE?
	
		System.out.println(Double.MIN_VALUE);	//4.9E-324 -> it is actually a positive number
		System.out.println(Float.MIN_VALUE);	//1.4E-45
		//in case of Double and Float only, minimum value is always a +ve number
		
		//rest all are -ve
		System.out.println(Long.MIN_VALUE);			//-9223372036854775808
		System.out.println(Integer.MIN_VALUE);	//-2147483648
		System.out.println(Byte.MIN_VALUE);		//-128
		System.out.println(Short.MIN_VALUE);		//-32768
		System.out.println((int)Character.MIN_VALUE);	//0
		
		/*
		 * there is a difference between 0 and '0' 
		 * 0 - 'null' and '0'- 48
		 */
		
		//Q. Which one is bigger -> Double MIN_VALUE or 0.0d? 
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));	//0.0
		//(Double.MIN_VALUE is actually a +ve number
		
		//same thing will happen for Float
		System.out.println(Math.min(Float.MIN_VALUE, 0.0f));		//0.0
		
		//but for Integer or Long or others, same thing will not happen
		System.out.println(Math.min(Integer.MIN_VALUE, 0.0d));	//-2.147483648E9
		System.out.println(Math.min(Integer.MIN_VALUE, 0));		//-2147483648
		
		//NEGATIVE_INFINITY	
		System.out.println(Double.NEGATIVE_INFINITY);  	//-Infinity
		System.out.println(Float.NEGATIVE_INFINITY);  	//-Infinity

		double inf = Double.POSITIVE_INFINITY;		
		System.out.println(inf + 5);			//Infinity
		System.out.println(inf - inf); // same as Double.NaN	//NaN
		System.out.println(inf * -1); // same as Double.NEGATIVE_INFINITY	//-Infinity
		
		
		//Q. Which one is bigger -> Double MIN_VALUE or NEGATIVE_INFINITY?
		System.out.println(Math.min(Double.MIN_VALUE, Double.NEGATIVE_INFINITY));	//-Infinity
	}

}
