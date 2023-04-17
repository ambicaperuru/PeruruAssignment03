package question26;

public class Lazy {

	
		private static Lazy sSoleInstance;

	    private Lazy(){}  //private constructor.

	    public static Lazy getInstance(){
	        if (sSoleInstance == null){ //if there is no instance available... create new one
	            sSoleInstance = new Lazy();
	        }

	        return sSoleInstance;
	    }

	}


