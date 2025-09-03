
//Print all the names whose length is greater than 5 using predicate

package predicate;

import java.util.function.Predicate;

public class NameGreaterthan {

	public static void main(String[] args) {
		String[] names= {"Jaga","Jyoti","Simran","Abhisek","Ashutosh"};
		Predicate<String> pr= s -> s.length() > 5;
		for(String name : names) {
			if(pr.test(name)) {
				System.out.print(name+" ");
			}
		}
	}

}
