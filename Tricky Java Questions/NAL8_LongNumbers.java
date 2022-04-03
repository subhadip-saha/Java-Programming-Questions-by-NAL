// Question: Output when print a long number with L and without L suffix in #Java?

package tricky_java_questions;

public class NAL8_LongNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long longNumberWithoutL = 1000*60*60*24*365;	//original product: 31536000000
		System.out.println(longNumberWithoutL);		// but compiler gives 1471228928 
		
		/*
		 * Explanation: 31536000000 - is not a 32 bits integer, it is a 36 bits integer, 
		 * convert this from decimal to binary : 11101010111101100010010110000000000
		 */
		
		long longNumberWithL = 1000*60*60*24*365L;	//original product: 31536000000
		System.out.println(longNumberWithL);	//31536000000
		
		/*
		 * So, with L, 36 bits are considered. The product is crossing maximum limit of integers which is 2147483647 (32 bits)
		 * Without L cannot handle, it will truncate 4 MSBs from its binary equivalent , so, that 36 bits truncated to 32 bits to accommodate 
		 * within its int range, So, see below
		 * 11101010111101100010010110000000000 => 1010111101100010010110000000000
		 * 31536000000 => 1471228928
		 * So, to get exact product, put L over there.
		 * 
		 */
		
	}

}
