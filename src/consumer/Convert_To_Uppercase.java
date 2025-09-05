
//Convert to uppercase all the names

package consumer;

import java.util.function.Consumer;

public class Convert_To_Uppercase {

	public static void main(String[] args) {
		
		Consumer<String> cu = s -> System.out.println(s.toUpperCase()); 
		
		String[] names = {"Kajal","debjani","Aiswarya","keertHY","sREELElla","Anushka"};
		
		for(String name: names) {
			cu.accept(name); 						//It prints directly, Never write System.out.println(consumer.accept(...)) because accept() returns void.
		}
													//If your action is modifying data, no need to print inside Consumer — you can print later.
	}

}
