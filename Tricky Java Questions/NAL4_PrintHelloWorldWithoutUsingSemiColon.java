//Question: Print Hello World without using semi colon (;) in Java

package tricky_java_questions;

public class NAL4_PrintHelloWorldWithoutUsingSemiColon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1st approach: Using printf - it will return the object of printstream
		if(System.out.printf("Hello World" + "\n") == null) {
			
		}
		
		//1st approach: Using append() method of StringBuilder class
		if(System.out.append("Hello World" + "\n") == null) {
			
		}
		
		//3rd approach: Using equals method of String class 
		if(System.out.append("Hello World" + "\n").equals(null)) {
			
		}
		
		//4th approach: using for loop
		for(int i = 0; i <1; System.out.println("Hello World")) {
			i++;
		}
		
		//do not use.
		System.out.println("Hi");
		System.out.printf("Hi");
	}

}
