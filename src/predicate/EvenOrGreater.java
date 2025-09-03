
//Display the number from the array which is even or greater than 15

package predicate;

import java.util.function.Predicate;

public class EvenOrGreater {

	public static void main(String[] args) {
		int[] arr = {10,8,5,9,7,25,2,24};
		Predicate<Integer> pr1= n -> n % 2 == 0;
		Predicate<Integer> pr2= n -> n > 15;
		
		for(int num : arr) {
			if(pr1.or(pr2).test(num)) {
				System.out.print(num+" ");
			}
		}
	}

}
