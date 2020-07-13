package di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di.entity.AiExam;
import di.entity.Exam;
import di.ui.ExamConsole;
import di.ui.InlineExamConsole;

public class DiProgram {

	public static void main(String[] args) {
		//Exam exam = new AiExam();
//		Exam exam = new AiExam(10, 10, 10);
//		ExamConsole console = new InlineExamConsole();
//		console.setExam(exam);
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("di/spring_di.xml");
		ExamConsole console = (ExamConsole) context.getBean("console");
		console.print();
		
	}

}
