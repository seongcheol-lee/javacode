package exam03;

public class Student {
	private int id;
	private String name;
	private int kor;
	private int math;
	private int eng;
	
	public Student(int id, String name, int kor, int math, int eng) {
		super();
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", kor=" + kor + ", math=" + math + ", eng=" + eng + "]";
	}
	
}
