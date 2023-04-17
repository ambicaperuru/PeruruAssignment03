package question10;
import java.io.IOException;

public class SubClass extends SuperClass{

	/*
	 * void method() throws IOException { System.out.println("SubClass");//Throws an
	 * error for IOException }
	 */
	void msg() throws ArithmeticException {
		System.out.println("Hi");
	}
	 
	  // Driver code
	  public static void main(String args[]) {
	    SuperClass x = new SubClass();
	    x.method();
	    x.msg();

}}
