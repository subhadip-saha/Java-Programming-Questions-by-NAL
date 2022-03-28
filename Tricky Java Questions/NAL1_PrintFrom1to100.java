//Question 1: Print from 1 to 100 without using any numbers in your code

package tricky_java_questions;

public class NAL1_PrintFrom1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//we cannot use any number here
		/*for(int i = 1; i <= 100; i++)
			System.out.println(i);*/
		
		//Approach 1
		
		/*int one = 'A' / 'A';			// it gives 1 as o/p
		String str = "..........";		// it gives 10 as o/p because of 10 dots
		
		for(int i = one; i <= (str.length() * str.length()); i++)
		{
			System.out.println(i);
		}*/
		
		
		//Approach 2: using ASCII
		
		int one = 'A' / 'A';
		for(int i = one; i <= 'd'; i+=one)		//ASCII of 'd' = 100, i++ and i+=one are same
			System.out.println(i);

	}

}
