//Print from to 1 to 100 without using any Loop and Recursion || OCJP Question

package tricky_java_questions;

import java.util.Arrays;
import java.util.BitSet;

public class NAL3_Print1to100WithoutUsingLoopAndRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Arrays.fill()
		
		Object num[] = new Object[100];
		
		//fill method fills all the values in one shot- unlike loop
		Arrays.fill(num, new Object() {
			int count = 0;
			@Override
			public String toString() {
				return Integer.toString(++count);
			}
			
		});
		
		System.out.println(Arrays.toString(num));
		
		//2. BitSet class
		
		String set = new BitSet() {{set(1,101);}}.toString();
		System.out.append(set, 1, set.length());
	}

}
