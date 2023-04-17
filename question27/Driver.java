package question27;

public class Driver {

	private static Driver instance = null;

	private Driver() {}

	public static synchronized Driver getInstance() {
	if (instance == null) {
	instance = new Driver();
	}

	return instance;
	}

}
