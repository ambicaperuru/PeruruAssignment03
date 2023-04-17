package question21;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerailizationClass {
	
	int id;  
	 String name;  
	 public SerailizationClass(int id, String name) {  
	  this.id = id;  
	  this.name = name;  
	 }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{       
			SerailizationClass s1 =new SerailizationClass(1,"john");    
			
			  FileOutputStream fileout=new FileOutputStream("file.txt");    
			  ObjectOutputStream objectout=new ObjectOutputStream(fileout); 
			  
			  objectout.writeObject(s1);    
			  objectout.flush();      
			  objectout.close();    
			  System.out.println("Done");    
			  }
		catch(Exception e){
			System.out.println(e);
			  }    
			 }    

	

}
