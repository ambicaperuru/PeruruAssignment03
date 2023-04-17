package question13;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arrayList = new ArrayList<String>();
		 
        // adding object to arraylist
		arrayList.add("ML");
		arrayList.add("Java");
		arrayList.add("Python");
		arrayList.add("JavaScript");
 
        // traversing elements using Iterator.
        System.out.println("ArrayList elements are:");
        Iterator it = arrayList.iterator();
        while (it.hasNext())
            System.out.println(it.next());
 
        // creating Vector
        Vector<String> v = new Vector<String>();
        v.addElement("HTML");
        v.addElement("CSS");
        v.addElement("Bootstrap");
 
        // traversing elements using Enumeration
        System.out.println("\nVector elements are:");
        Enumeration e = v.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement());

	}

}
