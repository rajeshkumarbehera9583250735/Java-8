
//Print Palindrome words from the given array

package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Palindrome_words {

	public static void main(String[] args) {
		String[] names= {"Rajat","nitin","Bhuvi","madam"};
		
		List<String> list= Arrays.asList(names);
		
		Consumer<String> ci= s -> {
			
			int start =0,end=s.length()-1;
			boolean isPalindrome =true;
			while(start < end) {
				if(s.charAt(start) != s.charAt(end)) {
					isPalindrome=false;
					break;
				}
				start++;
				end--;
			}
			if(isPalindrome) {
				System.out.println(s+" is a palindrome word.");
			}
		};
		list.forEach(ci);
		
	}

}
