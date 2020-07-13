package encapsulation;

import java.util.Scanner;

public class ExamList {
	Exam[] exams;
	int current;

	public void init(Exam[] exams, int current) {
		this.exams = exams;
		this.current = current;
	}

	public void print() {
		print(this.current);
	}

	public void print(int size) {
		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적 출력                  │");
		System.out.println("└───────────────────────────┘");
		System.out.println();

		for(int i=0;i<size;i++) {
			Exam exam = this.exams[i];
			int total = 0;
			float avg;
			//total = exam.kor + exam.eng + exam.math;
			total = exam.getKor() + exam.getEng() + exam.getMath();
			avg = total / 3.0f;
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
		this.exams[this.current] = new Exam();
		do {
			System.out.print("국어 : ");
			this.exams[this.current].setKor(scan.nextInt());

			if (this.exams[this.current].getKor() < 0 || 100 < this.exams[this.current].getKor())
				System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");

		} while (this.exams[this.current].getKor() < 0 || 100 < this.exams[this.current].getKor());
		do {
			System.out.print("영어 : ");
			this.exams[this.current].setEng(scan.nextInt());

			if (this.exams[this.current].getEng() < 0 || 100 < this.exams[this.current].getEng())
				System.out.println("영어성적은 0~100까지의 범위만 입력이 가능합니다.");

		} while (this.exams[this.current].getEng() < 0 || 100 < this.exams[this.current].getEng());
		do {
			System.out.print("수학 : ");
			this.exams[this.current].setMath(scan.nextInt());

			if (this.exams[this.current].getMath() < 0 || 100 < this.exams[this.current].getMath())
				System.out.println("수학성적은 0~100까지의 범위만 입력이 가능합니다.");

		} while (this.exams[this.current].getMath() < 0 || 100 < this.exams[this.current].getMath());
		this.current++;
		if(this.exams.length >= this.current) {
			Exam[] temp = new Exam[this.current + 3];
			for(int i=0; i<this.current; i++) {
				temp[i] = this.exams[i];
			}
			this.exams = temp;
		}
		System.out.println("─────────────────────────────");
	}
}