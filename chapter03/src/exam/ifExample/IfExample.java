package exam.ifExample;

import java.util.Scanner;

public class IfExample {
	public static void main(String[] args) {
		if(false) 
			System.out.println("인쇄");
		else
			System.out.println("!!");
		
		int random = (int)(Math.random() * 6) + 1;
		System.out.println(random);
		System.out.println("랜덤 주사위 숫자를 맞춰보세요.");
		Scanner scan = new Scanner(System.in);
		int in = scan.nextInt();
		if(random == in)
			System.out.println("정답");
		else
			System.out.println("오답");
		
		int count = 0;
		for(int i = 0; i < 5; i++ ) {
			int random = (int)(Math.random() * 6) + 1;
			System.out.println(random);
			System.out.println("랜덤 주사위 숫자를 맞춰보세요.");
			Scanner scan = new Scanner(System.in);
			int in = scan.nextInt();
			if(in >= 1 && in <= 6) {
				if(random == in) {
					System.out.println("정답");
					count++;
				}
				else {
					System.out.println("오답");
				}
			} else {
				System.out.println("숫자범위를 벗어났습니다.");
			}
		}
		System.out.println("정답 수 : " + count);
		
	}
}