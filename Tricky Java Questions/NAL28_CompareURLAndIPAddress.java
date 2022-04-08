// Question : What will be the output when you compare site URL with its IP address?

package tricky_java_questions;

import java.net.MalformedURLException;
import java.net.URL;

public class NAL28_CompareURLAndIPAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println(new URL("https://app.hubspot.com").equals(new URL("https://104.19.155.83")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

//true