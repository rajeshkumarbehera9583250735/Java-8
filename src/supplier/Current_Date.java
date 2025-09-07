
//Return current date and time by using supplier

package supplier;

import java.util.Date;
import java.util.function.Supplier;

public class Current_Date {

	public static void main(String[] args) {
		Supplier<Date> si = () -> new Date();
		System.out.println("Current date is: "+si.get());
	}

}
