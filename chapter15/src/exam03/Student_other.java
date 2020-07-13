package exam03;

import java.util.Comparator;

public class Student_other implements Comparable<Student> {
	private int id;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public Student_other(int id, String name, int kor, int eng, int math) {
		super();
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = (double) total / 3.0;
	}

	@Override
	public String toString() {
		return "학생번호 : " + id + ", 이름 : " + name + ", 국어=" + kor + ", 영어 : " + eng + ", 수학 : " + math + ", 총점  : "
				+ total + ", 평균 : " + avg;
	}

	// 기본-학생번호 순서로 정렬 되도록
	@Override
	public int compareTo(Student o) {
		return this.id - o.id;
	}

	// 총점 순으로 정렬하도록
	public static Comparator<Student> sortTotal = new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			return (o1.total - o2.total) * -1;
		}
	};

}
