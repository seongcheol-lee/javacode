package chapter06;

public class Car {
	boolean starter;
	String company;
	String Model;
	String color;
	int maxSpeed;
	int speed;
	int rpm;
	
	int myNumber;
	static int number = 0;

	public Car(String company) {	// 생성자
		super();
		myNumber = ++number;
		this.company = company;
	}

	public Car(boolean starter, String company, String model, String color, int maxSpeed, int speed, int rpm,
			int myNumber) {
		super();
		this.starter = starter;
		this.company = company;
		Model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.speed = speed;
		this.rpm = rpm;
		this.myNumber = myNumber;
	}

	public Car(boolean starter, String company, String model, String color, int maxSpeed, int speed, int rpm) {
		this(starter, company, model, color, maxSpeed, speed, rpm, 1);
	}
	
	int speedUp(int speed) {	// 메서드
		speed = speed + 10;
		return speed;
	}
	
	
	void starterOnOff() {	// 메서드
		starter = !starter;
	}
	
//	int sum(int ... values) {
//		int result = 0;
//		for(int i = 0; i < values.length; i++) {
//			result = result + values[i];
//		}
//		return result;
//	}
	
	int sum(char op, int ... values) {
		int result = 0;
		if(op == '+') {
			for(int i = 0; i < values.length; i++) {
				result = result + values[i];
			}
		} else if(op == '*') {
			result = 1;
			for(int i = 0; i < values.length; i++) {
				result = result * values[i];
			}
		}
	return result;
	}
}
