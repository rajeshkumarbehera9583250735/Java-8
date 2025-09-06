
//Square of each number from an primitive int array

package consumer_With_forEach;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Square_Of_Each_Number {

	public static void main(String[] args) {
		
		int[] nums = {2,9,3,6,5,7};									//Arrays in Java do not have forEach(Consumer) method.
		
		List<Integer> list = new ArrayList<>();						//Only Iterable (like List, Set, Map) and Stream have forEach() method , so Convert int[] to List<Integer>        
		
		for(int n: nums) {
			list.add(n);
		}															
				
		Consumer<Integer> ci =  n -> System.out.println("Square of "+ n +" is :"+ n * n);
		list.forEach(ci);
	}

}
