package lambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SortNamesInAscendingOrder {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>(Arrays.asList("rajesh","Karthik","brahma","Sita"));
		ArrayList<String> names = new ArrayList<>(set);
		names.sort((a,b) -> a.compareToIgnoreCase(b));
		System.out.println("After names are sorted in ascending order: "+ names);
	}

}
