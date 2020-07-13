package exam05;

public class Car {
	// 필드
	private int speed;			// 외부에서 접근 못하도록
	private boolean stop;		// 외부에서 접근 못하도록
	
	// 생성자
	
	// 메소드
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed >= 0 && speed <= 350) {
			this.speed = speed;
			//System.out.println("현재 속도 : " + this.speed);
		} else {
			System.out.println("잘못된 속도값 입력");
		}
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
