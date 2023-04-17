package question17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> stateCode = new HashMap<String, String>();
		stateCode.put("MO", "Missouri");
		stateCode.put("TX", "Texas");
		stateCode.put("CA", "California");
  
        Iterator it = stateCode.keySet().iterator();
  
        while (it.hasNext()) {
            System.out.println(stateCode.get(it.next()));
  
            // for adding an element to Map then exception will be thrown on next call
            //cityCode.put("FL", "Florida");
        }
        
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
  
        Iterator<Integer> itr1 = arrayList.iterator();
        while (itr1.hasNext()) {
            if (itr1.next() == 2) {
                //it will not throw Exception
                itr1.remove();
            }
        }
  
        System.out.println(arrayList);
  
        itr1 = arrayList.iterator();
		/*
		 * while (itr.hasNext()) { if (itr.next() == 3) { // will throw Exception on //
		 * next call of next() method al.remove(3); } }
		 */

	}

}
