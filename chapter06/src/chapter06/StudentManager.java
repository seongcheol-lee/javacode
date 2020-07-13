package chapter06;

public class StudentManager {
	public static void main(String[] args) {
		
		Student[] students = new Student[5];
		
		//System.out.println("학생정보 입력");
		
		for(int i = 0; i < students.length; i++) {
			students[i] = new Student("00"+i, "이름"+i, 10*i, 20*i, 30*i);
		}
		
		for(int i = 0; i < students.length; i++) {
			System.out.println("==========");
		}
	}
}

