
//Reverse each word in a string by using foreach method

package consumer_With_forEach;

import java.util.Arrays;
import java.util.function.Consumer;

public class Reverse_Each_Word_In_String {

	public static void main(String[] args) {
		String names= "Sehwag is a good player";
		
		String[] words= names.split(" ");
		
		Consumer<String> ci = word -> {
			String rev="";
			for(int i = word.length() - 1; i>=0; i--) {
				rev=rev+ word.charAt(i);
			}
			System.out.print(rev+" ");
		};
		
		Arrays.asList(words).forEach(ci);
	}

}
