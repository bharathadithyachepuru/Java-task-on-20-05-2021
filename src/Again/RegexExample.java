package Again;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

	public static void main(String[] args) {
  
		Pattern pat = Pattern.compile("Adithya");
		
		Matcher m = pat.matcher("BharathAdithya");
		
		while (m.find()) {
			
			System.out.println("Pattern found from" + m.start() + "to" + m.end());
			
	  }

	}

}
