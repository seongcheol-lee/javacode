package exam02;

public class Student {
	public int sno;
	public String name;
	
	public Student(int sno, String name) {			// 생성자 만들기
		super();									// 지워도 무방
		this.sno = sno;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {			// 들어오는 값이 Student 타입인지
			Student stu = (Student) obj;
			return (sno == stu.sno) && (name.equals(stu.name));
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return sno +name.hashCode();
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + "]";
	}
}
