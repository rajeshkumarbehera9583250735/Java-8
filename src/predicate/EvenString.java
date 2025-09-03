
// Write a java program using predicate and lambda expression to print all the strings from a given array whose lengths are even.

package predicate;

import java.util.function.Predicate;

public class EvenString {

	public static void main(String[] args) {
		String[] names= {"Rajesh","jyoti","Lija","Jaga","Balu","Radhika","Manash","Deepak","Alok","Dhana"};
		Predicate<String> pr = s -> s.length() % 2 == 0;
		for(String name : names) {
			if(pr.test(name)) {
				System.out.println(name+" ");
			}
		}
	}

}
