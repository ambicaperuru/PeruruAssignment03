package question26;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Eager inst1 = Eager.getInstance();

	        //Instance 2
	        Lazy inst2 = Lazy.getInstance();

	        //now lets check the hash key.
	        System.out.println("Instance 1 hash :" + inst1.hashCode());
	        System.out.println("Instance 2 hash :" + inst2.hashCode());  

	}

}
