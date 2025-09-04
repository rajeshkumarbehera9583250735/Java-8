
// Square of a number by using function

package function;

import java.util.function.Function;

public class Square_Of_A_Number {

	public static void main(String[] args) {
		Function<Integer,Integer> fi = n -> n*n;
		System.out.println("Square of 5 is: "+fi.apply(5));
	}

}
