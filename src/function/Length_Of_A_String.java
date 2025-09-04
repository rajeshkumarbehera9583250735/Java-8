
//Find a length of string using function

package function;

import java.util.function.Function;

public class Length_Of_A_String {

	public static void main(String[] args) {
		String str ="Aswasana";
		Function<String,Integer> fi = s ->s.length();
		System.out.println(fi.apply(str));
	}

}
