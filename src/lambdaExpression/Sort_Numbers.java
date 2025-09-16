/*
Sort numbers in descending order
*/
package lambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Sort_Numbers {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>(
				Arrays.asList(10,12,6,3,5,19,5,16)
		);
		
		System.out.println("Before numbers are sorting in descending order:"+ al);
		
		Comparator<Integer> comp = (a,b) -> b.compareTo(a);
		
		al.sort(comp);
		System.out.println("After numbers are sorting in descending order:"+al);
	}

}
