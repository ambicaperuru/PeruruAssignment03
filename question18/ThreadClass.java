package question18;

public class ThreadClass extends Thread {
	
	public void run(){
		System.out.println("Thread has started.");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadClass thrd = new ThreadClass();
		thrd.start();
		thrd.start();

	}

}
