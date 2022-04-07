//Question: Can We Execute Comments in Java? || Unicode carriage return

package tricky_java_questions;

public class NAL27_ExecuteComments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//NOTE: \U000D(in small) is a Unicode character for carriage return. It is actually putting the text 
		//after it a in a new line and execute it.
		 
		
		//This is a comment \u000d System.out.println("Red"); 
		System.out.print("Green");	
		\u000d System.out.println("Yellow");
		
		int num = 10;
		System.out.println(num);
		//till here it is comment, after that it will behave like fresh code written \u000d num = 20;
		System.out.println(num);
		System.out.println(\u000d);
		System.out.println("Blue");
		
	}

}

/*
	Red
	GreenYellow
	10
	20
	
	Blue
*/