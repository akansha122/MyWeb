package ArrayListAssignment.Question2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample2 {


   	    public static void iterateList(ArrayList<String> list) {
		System.out.println("Iterator");
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());

		}
		
	}

}
