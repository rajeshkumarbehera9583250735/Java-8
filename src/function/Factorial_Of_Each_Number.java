
//Factorial of all numbers from an array

package function;

import java.util.function.Function;

public class Factorial_Of_Each_Number {

	public static void main(String[] args) {
		Function<Integer,Integer> fi = num -> {
			int fact = 1;
			for(int i=1;i <= num; i++) {
				fact= fact*i;
			}
			return fact;
		};
		
		int[] n= {2,4,5,7};
		for(int num : n) {
			System.out.println("Factorial of "+ num +" is :"+ fi.apply(num));
		}
	}

}
