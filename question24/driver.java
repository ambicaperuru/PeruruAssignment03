package question24;

import java.util.ArrayList;
import java.util.List;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Runtime obj1 = Runtime.getRuntime();
	        for (int i=0; i<= 100000; i++) {
	            List<Integer> list = new ArrayList<>();
	            list.add(1);
	            list.add(2);
	            list.add(3);
	        }
	        System.out.println("Memory before invoking the Garbage Collector using system GC : " + obj1.freeMemory());
	        System.gc();
	        System.out.println("Memory after invoking the Garbage Collector using system GC : " + obj1.freeMemory());
		
		Runtime obj2 = Runtime.getRuntime();
        for (int i=0; i<= 100000; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
        }
        System.out.println("Memory before invoke Garbage Collector using runtime class method : " + obj2.freeMemory());
        obj2.gc();
        System.out.println("Memory after invoke the Garbage Collector using runtime class method : " + obj2.freeMemory());

	}

}
