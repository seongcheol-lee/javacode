package exam05;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();			// no static : 직접 만들어줘야 한다
		//myCar.speed = 9;
		myCar.setSpeed(50);
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		// 멈춤
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재 속도 : " + myCar.getSpeed());
	}
}
