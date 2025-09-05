
//Convert all the names to upper and lower case

package consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Convert_To_Upper_and_Lowercase {

	public static void main(String[] args) {
		String[] names= {"Akashya","salman","SarukhaN","ram","NiTiN","BiDyuT","PrAbHaS","MaheshBabu"};
		
		List<String> list = new ArrayList<>(Arrays.asList(names));
		
		Consumer<List<String>> cu = s ->{
			for(String n : s) {
				System.out.println(n.toUpperCase());
			}
		};
		
		Consumer<List<String>> cl = s ->{
			for(String n : s) {
				System.out.println(n.toLowerCase());
			}
		};
		
		cu.accept(list);
		
		System.out.println("---------------------------------------------------------------------------");
		
		cl.accept(list);
	}

}
