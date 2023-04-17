package question15;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Hashtable<Integer,String> hashtable =new Hashtable<Integer,String>();
		 hashtable.put(1,"Java");
		 hashtable.put(2,"Python");
		 hashtable.put(3,"javaScript");
		 hashtable.put(4,"C");
	        System.out.println("*******Hash table *********");
	        for (Map.Entry m:hashtable.entrySet()) {
	            System.out.println(m.getKey()+"  "+m.getValue());
	        }
	 
	        HashMap<Integer,String> hashMap =new HashMap<Integer,String>();
	        hashMap.put(5,"HTML");
	        hashMap.put(6,"CSS"); 
	        hashMap.put(7,"Bootstrap");
	        hashMap.put(8,"NodeJs");
	        hashMap.put(null, null);
	        System.out.println("*****Hash map**********");
	        for (Map.Entry m:hashMap.entrySet()) {
	            System.out.println(m.getKey()+"  "+m.getValue());
	        }

	}

}
