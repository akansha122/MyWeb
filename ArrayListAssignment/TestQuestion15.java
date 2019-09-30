package ArrayListAssignment;

import java.util.ArrayList;
import java.util.List;

public class TestQuestion15
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
	list2.add("Cream");
	list2.add("White");
	list2.add("Black");
	
		Question15.JoinArrayList(list, list2);
	}
	

}
