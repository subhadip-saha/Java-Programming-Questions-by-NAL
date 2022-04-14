// Question: Why password should be stored in char array char[] instead of string?

package tricky_java_questions;

import java.util.Arrays;

public class NAL38_PasswordStoredInCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pwd = "abc1";
		System.out.println("pwd is: " + pwd);
		
		char c[] = new char[] {'a','b','c','1'};
		System.out.println("pwd is: " + c);
		
		//Now once the password is being used for login purpose, we
		//can replace the password with dummy character immediately like replace with asterisk
		//so, someone is hacking by taking memory dump, he cannot understand the exact password
		
		Arrays.fill(c, '*');

		for(int i = 0; i < c.length; i++)
			System.out.print(c[i]);
	}

}
/*
pwd is: abc1
pwd is: [C@73a28541
****
1. Object of String are immutable/fixed/inalterable, so there are no methods that allow us to change/overwrite/zero out the 
contents of a String after usage.This feature makes String objects unsuitable for storing security sensitive
information like password.That's why, we should always collect and store this sensitive info in char array insted because 
char array is variable/changeable/alterable/mutable.Altough you change string object still the string object will be present
inside SCP/SCL.
 
2. If JVM crashed, it will generate jvm crash dump and whoever is monitoring the server can get crash dump and 
get the password, so it is recommended after usage password should be replaced with dummy character like *, hacker 
will get ****, and he/she can't recognize it.    
*/