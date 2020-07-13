package exam02;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ClassmateTest {
	public static void main(String[] args) {
		List<Classmate> classs = new LinkedList<>();
		
		classs.add(new Classmate(20170609,"정현진"));
		classs.add(new Classmate(20090695,"김선홍"));
		classs.add(new Classmate(20100730,"양재규"));
		
		Collections.sort(classs);								// 오름차순
		for(Classmate m : classs) {
			System.out.println(m);
		}
		System.out.println();
		Collections.sort(classs, Collections.reverseOrder());	// 내림차순
		for(Classmate m : classs) {
			System.out.println(m);
		}
		System.out.println();
		
		Collections.sort(classs, Classmate.comparator_name);
		for(Classmate m : classs) {
			System.out.println(m);
		}
	}
}
