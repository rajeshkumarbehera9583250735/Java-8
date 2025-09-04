
//Reverse the sentence

package function;

import java.util.function.Function;

public class ReverseSentence {

	public static void main(String[] args) {
		String str="Java is easy";
		
		Function<String,String> fi= s ->{
			String rev="";
			String[] words= s.split(" ");
			for(int i=words.length-1;i >= 0; i--) {
				rev = rev + words[i];
				
				if(i != 0) {
					rev=rev+" ";
				}
			}
			return rev;
		};
		
		System.out.println("After reverse : "+fi.apply(str));
	}

}
