package exam01;

public class BoxExample {
	public static void main(String[] args) {
		// 비제네릭
		Box box = new Box();
		box.setObject("홍길동");
		String name = (String) box.getObject();		// 강제로 형 변환해야

		Apple apple = new Apple();
		box.setObject(apple);
		Apple a = (Apple) box.getObject();			// 강제로 형 변환해야
	}
}
