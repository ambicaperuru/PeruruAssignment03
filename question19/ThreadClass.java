package question19;

public class ThreadClass extends Thread {
		public void run()
	    {
	        System.out.print("Thread");
	    }
	    public static void main(String[] args)
	    {
	        ThreadClass thr = new ThreadClass(); 
	        thr.start();
	    }
}
