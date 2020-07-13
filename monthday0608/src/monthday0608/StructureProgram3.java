package monthday0608;

import java.util.Scanner;

public class StructureProgram3 {
	//사용자입력IO
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		//점수배열
		int[] korList = new int[3];
		int[] engList = new int[3];
		int[] mathList = new int[3];
		int menu;
		boolean keepLoop = true;

		while (keepLoop) {
			//메뉴 출력
			printMenu();
			menu = scan.nextInt();
			switch (menu) {
			case 1:
				//점수 입력
				inputJumsu(korList, engList, mathList);
				break;
			case 2:
				//점수 출력
				printJumsu(korList, engList, mathList);
				break;
			case 3:
				//프로그램종료
				System.out.println("Bye~~");
				scan.close();
				keepLoop = false;
				break;
			default:
				System.out.println("잘못된 값을 입력하셨습니다. 메뉴는 1~3까지입니다.");
			}
		}
	}

	private static void printMenu() {
		System.out.println("┌───────────────────────────┐");
		System.out.println("│           메인 메뉴                  │");
		System.out.println("└───────────────────────────┘");
		System.out.println("\t1. 성적입력 ");
		System.out.println("\t2. 성적출력 ");
		System.out.println("\t3. 종료 ");
		System.out.println("\t선택> ");
	}

	private static void inputJumsu(int[] korList, 
			int[] engList, int[] mathList) {

		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적 입력                  │");
		System.out.println("└───────────────────────────┘");
		System.out.println();

		for (int i = 0; i < 3; i++)
			do {
				System.out.printf("국어%d : ", i + 1);
				korList[i] = scan.nextInt();

				if (korList[i] < 0 || 100 < korList[i])
					System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");

			} while (korList[i] < 0 || 100 < korList[i]);
		System.out.println("─────────────────────────────");

		for (int i = 0; i < 3; i++)
			do {
				System.out.printf("영어%d : ", i + 1);
				engList[i] = scan.nextInt();

				if (engList[i] < 0 || 100 < engList[i])
					System.out.println("영어성적은 0~100까지의 범위만 입력이 가능합니다.");

			} while (engList[i] < 0 || 100 < engList[i]);
		System.out.println("─────────────────────────────");

		for (int i = 0; i < 3; i++)
			do {
				System.out.printf("수학%d : ", i + 1);
				mathList[i] = scan.nextInt();

				if (mathList[i] < 0 || 100 < mathList[i])
					System.out.println("수학성은 0~100까지의 범위만 입력이 가능합니다.");

			} while (mathList[i] < 0 || 100 < mathList[i]);

		System.out.println("─────────────────────────────");
	}

	private static void printJumsu(int[] korList, 
			int[] engList, int[] mathList) {
		//총점
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		//평균
		float korAvg, engAvg, mathAvg;
		//최대, 최소 과목
		String best = "";
		String worst = "";

		for (int i = 0; i < 3; i++) {
			korTotal += korList[i];
			engTotal += engList[i];
			mathTotal += mathList[i];
		}
		korAvg = korTotal / 3.0f;
		engAvg = engTotal / 3.0f;
		mathAvg = mathTotal / 3.0f;

		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적 출력                  │");
		System.out.println("└───────────────────────────┘");
		System.out.println();

		for (int i = 0; i < 3; i++)
			System.out.printf("국어 %d : %3d\n", i+1, korList[i]);
		System.out.println("─────────────────────────────");
		
		for (int i = 0; i < 3; i++)
			System.out.printf("영어 %d : %3d\n", i+1, engList[i]);
		System.out.println("─────────────────────────────");
		
		for (int i = 0; i < 3; i++)
			System.out.printf("수학 %d : %3d\n", i+1, mathList[i]);
		System.out.println("─────────────────────────────");
		
		System.out.printf("국어 총점 : %3d\n", korTotal);
		System.out.printf("영어 총점 : %3d\n", engTotal);
		System.out.printf("수학 총점 : %3d\n", mathTotal);
		System.out.println("─────────────────────────────");
		
		System.out.printf("국어 평균 : %6.2f\n", korAvg);
		System.out.printf("영어 평균 : %6.2f\n", engAvg);
		System.out.printf("수학 평균 : %6.2f\n", mathAvg);
		System.out.println("─────────────────────────────");
	}
}