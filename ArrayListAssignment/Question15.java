package ArrayListAssignment;

import java.util.ArrayList;
import java.util.List;


public class Question15 {
	
	

	public static void JoinArrayList(List<String> list, List<String> list2) {
		System.out.println("Before Joining:"+ list2);
	    list2.addAll(list);
	    System.out.println("After joining:"+list2);
		
	}
}
