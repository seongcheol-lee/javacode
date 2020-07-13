package encapsulation_getset;

import java.util.Scanner;

public class ExamList {
	private Exam[] exams;
	private int current;

	public ExamList() {
		this(new Exam[3], 0);
	}

	public ExamList(Exam[] exams, int current) {
		this.exams = exams;
		this.current = current;
	}

	public void print() {
		print(this.current);
	}

	public void print(int size) {
		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적 입력                  │");
		System.out.println("└───────────────────────────┘");
		System.out.println();

		for (int i = 0; i < size; i++) {
			Exam exam = this.exams[i];
			int total = 0;
			float avg;
			total = exam.getTotal();
			avg = exam.getAvg();
			System.out.printf("국어 : %3d\n", exam.getKor());
			System.out.printf("영어 : %3d\n", exam.getEng());
			System.out.printf("수학 : %3d\n", exam.getMath());
			System.out.printf("총점 : %3d\n", total);
			System.out.printf("평균 : %6.2f\n", avg);
			System.out.println("─────────────────────────────");
		}
	}

	public void input(Scanner scan) {
		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적 입력                  │");
		System.out.println("└───────────────────────────┘");
		System.out.println();
		//	this.exams[this.current] = new Exam();
		Exam exam = new Exam();
		do {
			System.out.print("국어 : ");
			exam.setKor(scan.nextInt());

			if (exam.getKor() < 0 || 100 < exam.getKor())
				System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");

		} while (exam.getKor() < 0 || 100 < exam.getKor());
		do {
			System.out.print("영어 : ");
			exam.setEng(scan.nextInt());

			if (exam.getEng() < 0 || 100 < exam.getEng())
				System.out.println("영어성적은 0~100까지의 범위만 입력이 가능합니다.");

		} while (exam.getEng() < 0 || 100 < exam.getEng());
		do {
			System.out.print("수학 : ");
			exam.setMath(scan.nextInt());

			if (exam.getMath() < 0 || 100 < exam.getMath())
				System.out.println("수학성적은 0~100까지의 범위만 입력이 가능합니다.");

		} while (exam.getMath() < 0 || 100 < exam.getMath());

		if (this.exams.length == this.current) {
			Exam[] temp = new Exam[this.current + 3];
			for (int i = 0; i < this.current; i++) {
				temp[i] = this.exams[i];
			}
			this.exams = temp;
		}
		this.exams[this.current] = exam;
		this.current++;
		System.out.println("─────────────────────────────");
	}
}