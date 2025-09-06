
// Print palindrome words in the given string

package function;

import java.util.function.Function;

public class Palindrome_Words_In_a_String {

	public static void main(String[] args) {
		String s = "java madam in racecar is first level";
		
		Function<String,Boolean> fi = str ->{
			
			boolean found = false;
			String[] words= str.split(" ");
			
			for(String word : words) {
				boolean isPalindrome = true;
				
				int start =0,end = word.length()-1;
				while(start < end) {
					if(word.charAt(start) != word.charAt(end)) {
						isPalindrome = false;
						break;
					}
					start++;
					end--;
				}
				
				if(isPalindrome) {
					System.out.println(word +" is palindrome word.");
					found =true;
				}
			}
			
			return found;
		};
		
		fi.apply(s);
	}

}
