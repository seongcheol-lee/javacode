package exam.operator;

import java.util.Scanner;

public class AppleBox {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("사과 개수 입력");
	int totalApple = scan.nextInt();
//	int totalApple = 200;
	System.out.println("한 박스에 들어갈 사과 개수 입력");
	int oneBox = scan.nextInt();
//	int oneBox = 12;
	int appleBox = totalApple / oneBox;
	int remainApple = totalApple % oneBox;
	System.out.println("박스 수 : " + appleBox);
	System.out.println("남은 사과 수 : " + remainApple);
	}
}