
//Use of function chaining

package function;

import java.util.function.Function;

public class Function_Chaining {

	public static void main(String[] args) {
		Function<Integer,Integer> f1 = num -> num * 2;
		Function<Integer,Integer> f2 = num -> num * num * num;
		
		System.out.println(f1.andThen(f2).apply(5));			//Left to right work
		System.out.println(f1.compose(f2).apply(5));			//Right to left work
	}

}
