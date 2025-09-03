
//Display the name whose names starts with alphabet "s" [After converting into lowercase]

package predicate;

import java.util.function.Predicate;

public class NamesStartsWith {

	public static void main(String[] args) {
		String[] names= {"Rajesh","Manjeet","Sonu","Raja","Bivek","Sritam","Sibu","Sk"};
		Predicate<String> pr = s -> s.toLowerCase().startsWith("s");
		for(String name : names) {
			if(pr.test(name)) {
				System.out.println(name+" ");
			}
		}
	}

}
