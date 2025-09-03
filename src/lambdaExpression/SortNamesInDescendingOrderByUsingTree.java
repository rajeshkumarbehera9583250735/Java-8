package lambdaExpression;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SortNamesInDescendingOrderByUsingTree {

	public static void main(String[] args) {
		Set<String> treeSet=new TreeSet<>((a,b) -> b.compareTo(a));
		treeSet.addAll(Arrays.asList("Raj","Kanha","Hanuman","Dibya"));
		System.out.println("After names are sorted in descending order: "+ treeSet);
	}

}
