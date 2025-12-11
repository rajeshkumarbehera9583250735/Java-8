package interviewQuestions;

import java.util.Arrays;

public class PalinromeWordsFound {

	public static void main(String[] args) {
		String str="Madam World Level raCecar";
		Arrays.stream(str.split(" "))
			.filter(word ->{
				word=word.toLowerCase();
				String rev= new StringBuilder(word).reverse().toString();
				return word.equals(rev);
			})
				.forEach(System.out::println);
	}

}
