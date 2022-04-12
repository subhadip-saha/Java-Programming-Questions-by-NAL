//Check if Substring is Present in a Given String 

package tricky_java_questions;

public class NAL37_CheckSubstringPresentOrNot {

	//Method 1
	public static boolean isSubstring(String mainstring, String substring)
	{
		
		//boolean bool = mainstring.matches(substring);	//it returns false because we have to consider space also
		
		//it means the substring can start with any string and then the substring should be part of the main string and it can end with anything
		boolean bool = mainstring.matches("(.*)" + substring + "(.*)");
		return bool;
		
		//in one line without taking an extra variable
		//return mainstring.matches("(.*)" + substring + "(.*)");
	}
	
	//Method 2
	public static boolean isSubstring1(String mainstring, String substring)
	{
		return mainstring.contains(substring);
	}
	
	//Method 3
	public static boolean isSubstring2(String mainstring, String substring)
	{
		//It means if the substring is not available in the main string it will always return -1 in Java
		//if it is available, it'll return that specific index
		return mainstring.indexOf(substring) != -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isSubstring1("Happy new year", "year"));
		System.out.println(isSubstring2("Happy new year", "year"));
		
		//if year is present in Happy new year then isSubstring will return true
		System.out.println(isSubstring("Happy new year", "year"));
		//other testcases
		System.out.println(isSubstring("Happy new year", "Happy"));
		System.out.println(isSubstring("Happy new year", "NEW"));
		System.out.println(isSubstring("Happy new year", "Wishing"));
		System.out.println(isSubstring("Happy new year @ 2022", "@"));	//special symbol test
		System.out.println(isSubstring("Happy new year @ 2022", "20"));
		System.out.println(isSubstring("Happy new year", "Hap"));
		System.out.println(isSubstring("Happy new year", "y"));		//single character test
		System.out.println(isSubstring("Happy new year", null));		//it checks null also
		System.out.println(isSubstring("Happy new year", " "));		//one blank space
		System.out.println(isSubstring("Happy new year", "  "));	//two blank spaces
	}
 
}

/*
	true
	true
	true
	true
	false
	false
	true
	true
	true
*/