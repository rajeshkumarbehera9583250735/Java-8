package function;

import java.util.function.Function;

public class SumofNumbers {
	static int sum=0;
	public static void main(String[] args) {
		
		int[] arr= {10,5,8,12,3,17};
		Function<Integer,Integer> fi = n -> {
			sum=sum + n;
			return sum;
		};
		for(int num: arr) {
			fi.apply(num);
		}
		System.out.println("Sum of all numbers is :"+sum);
	}
}
