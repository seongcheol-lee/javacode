package exam01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		/*
		 * List<String> list = new LinkedList<String>();
		 * 
		 * list.add("JAVA"); list.add("JDBC"); list.add("Database");
		 * 
		 * System.out.println(list.size()); System.out.println(list.get(2)); list.add(1,
		 * "study"); System.out.println(list.get(1)); System.out.println();
		 * 
		 * for(int i = 0; i < list.size(); i++) { System.out.println(list.get(i)); }
		 * System.out.println();
		 * 
		 * list.remove(0); for(int i = 0; i < list.size(); i++) {
		 * System.out.println(list.get(i)); } System.out.println();
		 * 
		 * list.remove("JDBC"); for(int i = 0; i < list.size(); i++) {
		 * System.out.println(list.get(i)); }
		 */
		 
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList : " + (endTime-startTime) + "ns");

		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList : " + (endTime-startTime) + "ns");
	}
}
