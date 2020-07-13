package chapter06;

public class CarExample {
	public static void main(String[] args) {
		Car car1 = new Car("현대");
		System.out.println(car1.myNumber);
		System.out.println(car1.company);
		
		Car car2 = new Car("기아");
		System.out.println(car2.myNumber);
		System.out.println(car2.company);
		
		int sum = car2.sum('*', 2, 3, 76, 37, 12);
		System.out.println(sum);
	}
}
