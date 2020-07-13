package exam03;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ClassmateTest {

	public static void main(String[] args) {
		List<ClassMate> classs = new LinkedList<>();

		classs.add(new ClassMate(20170609, "정현진"));
		classs.add(new ClassMate(20090695, "김선홍"));
		classs.add(new ClassMate(20100730, "양재규"));

		Collections.sort(classs); //오름차순

		for(ClassMate m : classs) {
			System.out.println(m);
		}

		Collections.sort(classs,Collections.reverseOrder()); //내림차순
		
		for(ClassMate m : classs) {
			System.out.println(m);
		}

	    Collections.sort(classs,ClassMate.comparator_name); 
	    
	    for(ClassMate m : classs) {
			System.out.println(m);
		}

	 }
}
