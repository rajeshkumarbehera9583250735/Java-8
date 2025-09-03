
//Print all numbers from an array which is divisible by 3 but not divisible by 2

package predicate;

import java.util.function.Predicate;

public class DivisibleNumber {

	public static void main(String[] args) {
		int[] arr = {12,3,7,5,28,18,9,15};
		Predicate<Integer> pr = n -> n % 3 == 0 && n % 2 != 0;
		for(int num : arr) {
			if(pr.test(num)) {
				System.out.println(num+" ");
			}
		}
	}

}
