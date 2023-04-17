package question14;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> courseList = Collections.synchronizedList(new ArrayList<String>());

		courseList.add("java");
		courseList.add("Python");
		courseList.add("C");

		synchronized (courseList) {
			Iterator itr = courseList.iterator();

			while (itr.hasNext())
				System.out.println(itr.next());
		}

		CopyOnWriteArrayList<String> listThreadSafe = new CopyOnWriteArrayList<String>();

		// Adding elements to synchronized ArrayList
		listThreadSafe.add("HTML");
		listThreadSafe.add("CSS");
		listThreadSafe.add("Bootstrap");

		System.out.println("synchronized ArrayList :");
		Iterator<String> it = listThreadSafe.iterator();

		while (it.hasNext())
			System.out.println(it.next());

	}

}
