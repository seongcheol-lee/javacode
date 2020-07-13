package exam03;

import java.util.Comparator;

public class ClassMate implements Comparable<ClassMate> {
	int stunum;
	String name;
	

	public ClassMate(int stunum, String name) {
		super();
		this.stunum = stunum;
		this.name = name;
	}


	@Override
	public String toString() {
		return "ClassMate [stunum=" + stunum + ", name=" + name + "]";
	}


	@Override
	public int compareTo(ClassMate o) {
		// 두 객체를 비교해서 같으면 0, 작으면 음수, 크면 양수를 반환
		// return name.compareTo(o.name); //이름순서
		//return stunum - o.stunum; 
		return name.compareTo(o.name);
	}

	public static Comparator<ClassMate> comparator_name = 
			new Comparator<ClassMate>() {
		@Override
		public int compare(ClassMate o1, ClassMate o2) {
			// return o1.name.compareTo(o2.name); //오름차순
			return o1.name.compareTo(o2.name) * -1;
			// 기본정렬방식의 역으로 변경,내림차순
		}  };
		
}
