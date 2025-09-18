package consumer_With_forEach;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;

public class PrintOnlyStringToUpperCase {

	public static void main(String[] args) {
		
		Set<Object> obj = new LinkedHashSet<>(Arrays.asList(10,"rAJ","Jaga",12,3,"rajesh","jYoTi"));
		
		Consumer<Object> fi= object -> {
				if(object instanceof String s) { 
					System.out.println(s.toUpperCase());
				}else {
					System.out.println(object);
				}
		};
		
		obj.forEach(fi);
	}

}
