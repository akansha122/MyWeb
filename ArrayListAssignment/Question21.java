package ArrayListAssignment;

import java.util.ArrayList;
import java.util.List;

public class Question21 {

	public static void replaceElement(ArrayList<String> list) {

		System.out.println("Before replacment:" + list);
		list.set(2, "Black");
		System.out.println("After replacment" + list);
	}

}
