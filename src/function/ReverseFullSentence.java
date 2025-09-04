
//Reverse the whole sentence

package function;

import java.util.function.Function;

public class ReverseFullSentence {

	public static void main(String[] args) {
		String str= "Java is easy to learn";
		
		Function<String,String> fi= s -> {
			String revSentence="";
			for(int i= s.length()-1;i>=0;i--) {
				revSentence= revSentence + s.charAt(i);
			}
			return revSentence;
		};
		
		System.out.println("After reverse the whole sentence : "+fi.apply(str));
	}

}
