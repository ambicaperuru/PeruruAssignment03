package overridePrivateStatic;

public class SubClass extends SuperClass {
	void msg() {
		System.out.println("subclass");
	}
	/*
	 * void greetings() { System.out.println("hii"); }
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperClass x = new SubClass();
		//x.msg();// Trying to override the private method
		//x.greetings(); // Trying to override the static method
	}

}
