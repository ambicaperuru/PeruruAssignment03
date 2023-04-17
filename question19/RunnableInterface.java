package question19;

public class RunnableInterface implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableInterface r1 = new RunnableInterface();
        Thread th = new Thread(r1, "r");
        
        th.start();
        System.out.println(th.getName());
    }
    @Override 
    public void run()
    {
        System.out.println("inside run");
    }
}
