
//Convert all the names that are stored in string array to uppercase

package function;

import java.util.function.Function;

public class Convert_Names_To_Uppercase {

	public static void main(String[] args) {
		String[] names = {"ashok","kanhu","ashish","SamBit","SillON"};
		Function<String,String> fi = s -> s.toUpperCase();
		for(String name: names) {
			System.out.println(fi.apply(name));
		}
	}

}
