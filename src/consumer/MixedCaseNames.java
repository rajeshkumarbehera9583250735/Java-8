
//Write a java program to display all the names of First half letters in uppercase and Second half in lowercase

package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MixedCaseNames {

	public static void main(String[] args) {
		List<String> names =Arrays.asList("karishma","Samntha","niVetha","Nitya","Rachana","Archita");
		
		Consumer<List<String>> cm = list ->{
			for(String name : list) {
				int mid = name.length() / 2;
				String firstHalf = name.substring(0,mid).toUpperCase();
				String secondHalf = name.substring(mid).toLowerCase();
				
				System.out.println(firstHalf+secondHalf);
			}
		};
		
		cm.accept(names);
	}

}
