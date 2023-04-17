package question9;

import java.io.FileOutputStream;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileOutputStream fileOutputStream =new FileOutputStream("abc.txt")){      
			String msg = "Hello!";      
			byte bArray[] = msg.getBytes();  
			fileOutputStream.write(bArray);  
			System.out.println("successfuly!");      
			}catch(Exception exception){  
			       System.out.println(exception);  
			}      

	}

}
