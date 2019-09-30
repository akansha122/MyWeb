package ArrayListAssignment;

import java.util.ArrayList;
import java.util.List;

public class TestQuestion13
{
	
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Blue");
		list.add("Orange");
		list.add("Purple");
		list.add("Yellow");

		List<String> list2 = new ArrayList<String>();
		list2.add("Brown");
		list2.add("Blue");
		list2.add("Orange");
		list2.add("Purple");
	
		Question13.CompareTwoArrayList(list, list2);
	}
	

}

