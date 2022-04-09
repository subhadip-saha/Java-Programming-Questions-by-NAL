//Print Hello World Without Static Block and Blank Main Method Body

package tricky_java_questions;

public class NAL69_PrintHelloWorldDifferently {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println("Hello World"); //not allowed to do this, main method should be blank
	}

	//System.out.println("Hello World");		//error, cannot write it outside main block
	
	//print Hello World with static block
	static {		//static block is loaded at the time of class loading and then executed before main method 
		System.out.println("Hello World");
	}
	
	
	//print Hello World without static block too
	//create a static method
	public static int printString() {
		System.out.println("Hello World");
		return 1;	//you can return 0 also, anything will work, but we have to return 
	}
	
	//create a static variable
	static int p = printString();
	
	//OR, function might be boolean also
	
	public static boolean printHW() {
		System.out.println("Hello World");
		return true;	//you can return false also
	}
	
	//create a static variable
	static boolean q = printHW();
}
