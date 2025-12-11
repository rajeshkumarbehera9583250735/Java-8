package interviewQuestions;

public class PalindromeAdvanced {

	public static void main(String[] args) {
		String str = "A man a plan a canal Panama";
		str=str.replaceAll("\\s+", "").toLowerCase();
		String rev=new StringBuilder(str).reverse().toString();
		if(str.equals(rev)) System.out.println("It is a palindrome sentence.");
		else System.out.println("It is not a palindrome sentence.");
	}

}
