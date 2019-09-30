package ArrayListAssignment;

import java.util.ArrayList;
import java.util.List;

public class TestQuestion8 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Blue");
		list.add("Orange");
		list.add("Purple");
		list.add("Yellow");

		Question8.sortElement(list);
	}

}
