
//Display the number from an array which is Odd and greater than 10

package predicate;

import java.util.function.Predicate;

public class OddAndGreater {

	public static void main(String[] args) {
		int[] arr= {2,5,19,10,13,4,6};
		Predicate<Integer> pr1 = n -> n % 2 != 0;
		Predicate<Integer> pr2 = n -> n > 10;
		for(int num : arr) {
			if(pr1.and(pr2).test(num)) {
				System.out.println(num +" ");
			}
		}
	}

}
