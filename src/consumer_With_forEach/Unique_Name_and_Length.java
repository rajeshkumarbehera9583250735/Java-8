
// Print Unique names and its length from a string array

package consumer_With_forEach;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class Unique_Name_and_Length {

	public static void main(String[] args) {
		String[] names = {"Kohli","Rohit","Kohli","Ashwin","bumrah","Ashwin","Rahul","Rohit"};
		Set<String> set = new HashSet<>(Arrays.asList(names));										// Arrays.asList() doesn’t work with primitive int[] but work with Non primitive type like String 
		
		Consumer<String> ci = name -> System.out.println("Name is "+ name +" and its length is : "+ name.length());
		set.forEach(ci);
	}

}
