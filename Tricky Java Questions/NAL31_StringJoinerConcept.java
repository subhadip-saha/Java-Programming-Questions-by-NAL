//What is StringJoiner in JDK 1.8 || Combine Multiple Strings into One
//it can be used in json payload

package tricky_java_questions;

import java.util.StringJoiner;

public class NAL31_StringJoinerConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//combine multiple string into a single string separated by a delimiter
		StringJoiner joiner = new StringJoiner(",", "[", "]");	//delimiter, prefix, suffix
		
		joiner.add("Red").add("Green").add("Blue").add("Yellow");
		
		System.out.println(joiner.toString());	////[Red,Green,Blue,Yellow]
		
		

	}

}
