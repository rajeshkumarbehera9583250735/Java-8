
// Generating the new otp always

package supplier;

import java.util.function.Supplier;

public class OtpGenerator {

	public static void main(String[] args) {
		Supplier<String> si = () -> {
			String otp="";
			for(int i=0;i<4;i++) {
				otp = otp + (int) (Math.random() * 10);
			}
			
			return otp;
		};
		
		System.out.println("Generated OTP: " + si.get());
	}

}
