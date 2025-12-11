package interviewQuestions;

public class PalindromeCheck {

	public static void main(String[] args) {
		String str="Madam";
		str=str.toLowerCase();
		String rev=new StringBuilder(str.toLowerCase()).reverse().toString(); 
		
		if(str.equals(rev)) {
			System.out.println(str+" is a palindrome word.");
		}else {
			System.out.println(str+" is not a palindrome word.");
		}
	}

}
