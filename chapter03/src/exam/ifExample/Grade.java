package exam.ifExample;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		String grade = " ";
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int score = scan.nextInt();
		int cutline = score/10;
		
		switch(cutline) {
		case 10:
			grade = "A+";
			break;
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
			break;
		}
		System.out.println("성적 : " + grade);
	}
}
