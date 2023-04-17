package question26;

public class Eager {

	 private static volatile Eager sSoleInstance = new Eager();

	    //private constructor.
	    private Eager(){}

	    public static Eager getInstance() {
	        return sSoleInstance;
	    }

}
