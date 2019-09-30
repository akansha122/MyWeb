package ArrayListAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question9 {

	public static void copyArray(List<String> list, List<String> list2) {

		Collections.copy(list, list2);
		System.out.println(list);
		System.out.println(list2);
	}

}
