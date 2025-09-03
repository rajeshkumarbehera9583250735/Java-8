//Custom thread with lambda expression

package lambdaExpression;

public class CustomThread_With_Lambda {

	public static void main(String[] args) {
		Runnable r = () -> System.out.println("Child Thread");
		Thread t = new Thread(r);
		t.start();
		System.out.println("Main Thread");
	}

}


/*
 //Custom Thread without Lambda expressions:-
 
 public class MyRunnable implements Runnable{
 	@Override
 	public void run(){
 		System.out.println("Child Thread");
 	}
 }
 
 Public class Main{
 	public static void main(String[] args){
 		Runnable r= new MyRunnable();
 		Thread t=new Thread(r);
 		t.start();
 		System.out.println("Main Thread");
 	}
 }
 
 */

