package question6;

public class Driver {
	 public static String WithString()    {  
	        String t = "string";  
	        for (int i=0; i<100000; i++){  
	            t = t + "s";  
	        }  
	        return t;  
	    }  
	 
	 public static String WithStringBuffer(){  
	        StringBuffer sb = new StringBuffer("string");  
	        for (int i=0; i<100000; i++){  
	            sb.append("buffer");  
	        }  
	        return sb.toString();  
	    }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sTime = System.currentTimeMillis();  
        WithString();  
        System.out.println("time taken for String: "+(System.currentTimeMillis()-sTime)+"ms");  
        sTime = System.currentTimeMillis();  
        WithStringBuffer();  
        System.out.println("time taken for StringBuffer: "+(System.currentTimeMillis()-sTime)+"ms");  

	}

}
