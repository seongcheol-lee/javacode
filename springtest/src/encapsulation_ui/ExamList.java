package encapsulation_ui;

import java.util.Scanner;

public class ExamList {
	private Exam[] exams;
	private int current;

	public int getCurrent() {
		return current;
	}

	public ExamList() {
		this(new Exam[3], 0);
	}

	public ExamList(Exam[] exams, int current) {
		this.exams = exams;
		this.current = current;
	}

	public Exam get(int i) {
		return exams[i];
	}

	public void add(Exam exam) {
		if (this.exams.length == this.current) {
			Exam[] temp = new Exam[this.current + 3];
			for (int i = 0; i < this.current; i++) {
				temp[i] = this.exams[i];
			}
			this.exams = temp;
		}
		this.exams[this.current] = exam;
		this.current++;
	}
}