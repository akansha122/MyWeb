package ArrayListAssignment;

import java.util.ArrayList;
import java.util.List;

/////////////20. Write a Java program to increase the size of an array list. /////////////
public class Question20 {
	

	public static void IncreaseSize(ArrayList<String> list) {

		list.ensureCapacity(4);
		list.add("Yellow");
		list.add("White");
		
		System.out.println(list);
		
	}

}
