package csu.Patel;

import java.util.ArrayList;
import java.util.Date;

public class Driver2 {
	// Goal: Understanding GENERIC Classes

	public static void main(String[] args) {

		ArrayList list1 = new ArrayList();
		list1.add(111);
		list1.add(19.99);
		list1.add("aaaa");
		list1.add(new Date());

		System.out.println(list1);
		// [111, 19.99, aaaa, Thu Jun 04 10:08:18 CDT 2015]

		// ArrayList<String> list2 = new ArrayList<>();
		// list2.add("abc");
		// list2.add("123");

	}

}
