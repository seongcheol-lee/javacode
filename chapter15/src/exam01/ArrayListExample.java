package exam01;

import java.util.ArrayList;
import java.util.List;
//import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("JAVA");
		list.add("JDBC");
		list.add("Database");
		
		System.out.println(list.size());
		System.out.println(list.get(2));
		list.add(1, "study");
		System.out.println(list.get(1));
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		list.remove(0);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		list.remove("JDBC");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
