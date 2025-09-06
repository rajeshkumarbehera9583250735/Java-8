
//The string is a Palindrome word or not

package predicate;

import java.util.function.Predicate;

public class Palindrome_Or_Not {

	public static void main(String[] args) {
		String s= "madam";
		Predicate<String> pi = n -> {
			int start= 0, end = n.length()-1;
			while(start < end) {
				if(n.charAt(start) != n.charAt(end)) return false;
				start++;
				end--;
			}
			return true;
		};
		System.out.println("Is "+s+" a palindrome word ? "+ pi.test(s));
	}

}
