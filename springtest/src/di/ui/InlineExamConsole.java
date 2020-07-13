package di.ui;

import di.entity.Exam;

public class InlineExamConsole implements ExamConsole {
	private Exam exam;
	@Override
	public void print() {
		System.out.printf("Total is %d", exam.getTotal());
	}

	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
	}

}
