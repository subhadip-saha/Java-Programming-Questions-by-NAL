/*
 * What will be the output when you print this: 
 * (byte) + (char) - (int) + (long) - 1 ?
 */

package tricky_java_questions;

public class NAL24_PrintAnInterestingThing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//in the expression, assignment operation begins from right to left

		
		int x = (byte) + (char) - (int) + (long) - 1;
		System.out.println(x);	//1
		
		/*
		 * proof of the concept
		 * int x1 = (long) - 1;	//error, Type mismatch: cannot convert from long to int
		 * So, -1 is type-casted to long type and we should hold this value in a long type variable
		 */
		
		long x1 = (long) - 1;
		System.out.println(x1);	//-1
		
		int x2 = (int) + (long) - 1;	//(long) - 1 is -1
		System.out.println(x2);	//-1	now, long type -1 is typecasted to int type -1
		
		int x3 = (char) - (int) + (long) - 1;	//(int) + (long) - 1 is -1
		System.out.println(x3);	//1	now, int type -1 is typecasted to char type 1
		
		byte x4 = (byte) + (char) - (int) + (long) - 1;		//(char) - (int) + (long) - 1 is 1
		System.out.println(x4);	//1	now, char type 1 is typecasted to byte type 1
	}

}
