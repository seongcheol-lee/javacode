package exam02;

import java.util.Comparator;

public class Classmate implements Comparable<Classmate>{
	int stunum;
	String name;
	
	// 생성자 및 toString() 추가
	public Classmate(int stunum, String name) {
		this.stunum = stunum;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Classmate [stunum=" + stunum + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(Classmate o) {
		// 두 객체를 비교해서 같으면 0, 작으면 음수, 크면 양수를 반환
		// return name.compareTo(o.name);	// 이름 순서
		return stunum - o.stunum;
	}

	public static Comparator<Classmate> comparator_name = new Comparator<Classmate>() {
		@Override
		public int compare(Classmate o1, Classmate o2) {
			// return o1.name.compareTo(o2.name)	// 오름차순
			return o1.name.compareTo(o2.name) * -1;
			// 기본 정렬방식의 역으로 변경, 내림차순
		}
	};
	
	public static Comparator<Classmate> com_name = new Comparator<Classmate>() {
		public int compare(Classmate o1, Classmate o2) {
			
			return 0;
		}
	};
}
