package exam_interface;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class OopProgram {
	// 사용자입력IO
	static Scanner scan = new Scanner(System.in);
	static Battery battery;

	public static void main(String[] args) throws IOException {
		// 점수배열
		ExamConsole list = new ExamConsole();
		int menu;
		boolean keepLoop = true;

		while (keepLoop) {
			// 메뉴 출력
			list.printMenu();
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				// 점수 입력
				list.input(scan);
				break;
			case 2:
				// 점수 출력
				list.print();
//				list.print(1);
				break;
			case 3:
				// 프로그램종료
				System.out.println("Bye~~");
				scan.close();
				keepLoop = false;
				break;
			case 4:
				// 배터리 호출
				//battery.getEnergy();
				FileInputStream fis =
				new FileInputStream("src/exam_interface/config.txt");		// 경로
				scan = new Scanner(fis);
				String className = scan.next();
				System.out.println(className);
				scan = new Scanner(System.in);
				fis.close();
				
				X x = new D();						// 인터페이스 : 약한 결합(B, C, D)
				A a = new A();
				//A a = new A(x);
				a.setX(x);
				a.print();
				break;
			default:
				System.out.println("잘못된 값을 입력하셨습니다. 메뉴는 1~3까지입니다.");
			}
		}
	}
}