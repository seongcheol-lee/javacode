package exam03;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StudentMain_other {
	public static void main(String[] args) {
		boolean run = true;
		int selectNo;
		Scanner sc = new Scanner(System.in);
		List<Student> list = new LinkedList<Student>();

		while (run) {
			System.out.println("------------------------------------------------------");
			System.out.println("메뉴");
			System.out.println("1.학생입력 | 2.학생삭제 | 3.전체성적조회 | 4.종료 ");
			System.out.println("------------------------------------------------------");
			System.out.print("입력> ");
			selectNo = sc.nextInt();
			sc.nextLine();

			if (selectNo == 1) {
				System.out.println("학생 이름을 입력해주세요.");
				System.out.print("입력> ");
				String name = sc.nextLine();

				System.out.println("국어 성적을 입력해주세요.");
				System.out.print("입력> ");
				int kor = sc.nextInt();

				System.out.println("영어 성적을 입력해주세요.");
				System.out.print("입력> ");
				int eng = sc.nextInt();

				System.out.println("수학 성적을 입력해주세요.");
				System.out.print("입력> ");
				int math = sc.nextInt();

				Student student = new Student(list.size(), name, kor, eng, math);
				list.add(student);

			} else if (selectNo == 2) {
				if (list.size() == 0) {
					System.out.println("입력된 학생이 없습니다.");
				} else {
					System.out.println("삭제할 학생번호를 입력해주세요.");
					Collections.sort(list);
					for (Student student : list) {
						System.out.println(student.toString());
					}
					System.out.print("입력> ");
					int id = sc.nextInt();
					boolean flag = true;
					for (int i = 0; i < list.size(); i++) {
						if (list.get(i).getId() == id) {
							list.remove(i);
							flag = false;
						}
					}
					if (flag == true)
						System.out.println("해당하는 id가 없습니다.");
				}

			} else if (selectNo == 3) {
				System.out.println("정렬 기준을 선택해주세요.");
				System.out.println("1.학생번호 | 2.성적");
				System.out.print("입력 > ");
				int sort = sc.nextInt();
				if (sort == 1) {
					Collections.sort(list);
					for (Student student : list) {
						System.out.println(student.toString());
					}
				} else if (sort == 2) {
					Collections.sort(list, Student.sortTotal);
					for (Student student : list) {
						System.out.println(student.toString());
					}
				} else {
					System.out.println("잘못된 입력입니다.");
				}
			} else if (selectNo == 4) {
				run = false;
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}
		System.out.println("프로그램 종료");
	}
}
