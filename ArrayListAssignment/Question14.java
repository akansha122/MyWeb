package ArrayListAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Question14 {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Blue");
		list.add("Orange");
		list.add("Purple");
		list.add("Yellow");
		
		Collections.swap(list, 1, 4);
		
		for(String list1 : list)
		{
		System.out.println(list1);
		}
		
	}

}
