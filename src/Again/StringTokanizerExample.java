package Again;

import java.util.StringTokenizer;

public class StringTokanizerExample {

	public static void main(String[] args) {

		String sentence = "Honesty is the best policy";
		
		StringTokenizer st = new StringTokenizer(sentence, " ");
		
		while (st.hasMoreTokens()) {
			
			System.out.println(st.nextToken());
			
		}

	}

}
