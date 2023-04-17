package question12;

public class Driver {
	public void finalize() throws Throwable{
	      System.out.println("Object gc");
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int value = 10;
		//value = 11;
		System.out.println(value);
		try{
	         int a = 10;
	         int b = 0;
	         int result = a/b;
	      }catch(Exception e){
	         System.out.println("Error : "+ e.getMessage());
	      }
	      finally{
	         System.out.println("Donr.");
	      }
		Driver t = new Driver();
	      t = null;
	      System.gc();

	}

}
