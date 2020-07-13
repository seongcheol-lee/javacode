package chapter06;

public class CalExample {
	public static void main(String[] args) {
		Cal cal = new Cal();
		int i = cal.add(5, 4);
		System.out.println(i);
		System.out.println(cal.add(5.0, 4.0));
		System.out.println(cal.add('a', 'b'));
	}
}
