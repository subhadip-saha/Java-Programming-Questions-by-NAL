// Question : Pass null argument with method overloading of String and Object types

package tricky_java_questions;

public class NAL12_NullArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test(null);		//Object is parent class of String, so default value of both of them is null 
	}
	
	//method overloading
	public static void test(Object o) {
		System.out.println("Object Argument");
	}
	
	public static void test(String s) {				//String Argument
		System.out.println("String Argument");
	}
	
	//So, preference is given to String, because most obvious data-type for null is String
	//so, compiler likes it.
	
	
	 //for both of them it is because there is no hierarchy b/w String and StringBuffer/StringBuilder
	
	//b/w Object and StringBuffer/StringBuilder - StringBuffer/StringBuilder will get preference
	
	/*public static void test(StringBuffer s) {			//ambiguous
		System.out.println("StringBuffer Argument");
	}
	
	public static void test(StringBuilder s) {			//ambiguous
		System.out.println("StringBuilder Argument");
	}*/
	
}
