//Find Percentage Of Uppercase Letters, Lowercase Letters, Digits And Special Characters In String?

package tricky_java_questions;

import java.text.DecimalFormat;

public class NAL63_PercentageOfDifferentCharacters {

	public static void getCharPercentage(String str)
	{
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		int digitCount = 0;
		int symbolCount = 0;			//special characters
		
		//Extract each character from string and count should be increased for different characters
		int len = str.length();
		
		for(int i = 0; i < len; i++)
		{
			char ch = str.charAt(i);
			
			if(Character.isUpperCase(ch))
				upperCaseCount++;
			else if(Character.isLowerCase(ch))
				lowerCaseCount++;
			else if(Character.isDigit(ch))
				digitCount++;
			else
				symbolCount++;			
		}

		double upperCasePercentage = (upperCaseCount * 100.0) / len;
		double lowerCasePercentage = (lowerCaseCount * 100.0) / len;
		double digitPercentage = (digitCount * 100.0) / len;
		double symbolPercentage = (symbolCount * 100.0) / len;
		
		System.out.println("In the given string: " + str);
		
		System.out.println();
		
		DecimalFormat df = new DecimalFormat("##.##");		//formatting of result upto two decimal point
		
		System.out.println("Upper Case Percentage = " + df.format(upperCasePercentage));
		System.out.println("Lower Case Percentage = " + df.format(lowerCasePercentage));
		System.out.println("Digit Percentage = " + df.format(digitPercentage));
		System.out.format("Symbol Percentage = " + df.format(symbolPercentage));
		
		/*
		 * You can format the result in this way also
		 * System.out.println("Upper Case Percentage = " + String.format("%.2f", upperCasePercentage));
		 * System.out.format("Symbol Percentage = %.2f",  symmbolPercentage);
		 */
		
		System.out.println();
		
		System.out.println(upperCasePercentage+lowerCasePercentage+digitPercentage+symbolPercentage);	//verification
		
		System.out.println("---------------------------------------------------"); //separator for different test-cases
	}
	
	public static void main(String[] args) {
		
			getCharPercentage("Subhadip");
			getCharPercentage("Subhadip Saha");
			getCharPercentage("S");
			getCharPercentage("p");
			getCharPercentage("Sp");
			getCharPercentage("Subhadip123");
			getCharPercentage("Hello@World");
			getCharPercentage("100");
			getCharPercentage("1$");
			getCharPercentage(" ");
	}

}
