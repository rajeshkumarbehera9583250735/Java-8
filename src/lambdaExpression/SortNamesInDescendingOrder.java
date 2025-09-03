package lambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;

public class SortNamesInDescendingOrder {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<>(Arrays.asList("Rajesh","Bishnu","Siba","Ganesh"));
		names.sort((a,b) -> b.compareTo(a));
		System.out.println("After names are sorted in descending order: "+names);
	}

}
