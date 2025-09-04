
//Reverse all the string from an array

package function;

import java.util.function.Function;

public class ReverseString {

	public static void main(String[] args) {
		Function<String,String> fi = str ->{
			char[] ch=str.toCharArray();
			String rev="";
			for(int i=ch.length-1;i>=0;i--) {
				rev=rev+ch[i];
			}
			return rev;
		};
		
		String[] str= {"Puja","Linky","Chulu","saki","Gudulu","Lulu"};
		
		for(String s : str) {
			System.out.println("After reverse "+ s +" is : "+ fi.apply(s));
		}

	}
}
