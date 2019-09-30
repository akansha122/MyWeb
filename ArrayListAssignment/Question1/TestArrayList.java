package ArrayListAssignment.Question1;

import java.util.ArrayList;

import ArrayListAssignment.ArrayListExample1;

public class TestArrayList {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Blue");
		list.add("Orange");
		list.add("Purple");
		list.add("Yellow");

		ArrayListExample1.displayList(list);

	}

}
