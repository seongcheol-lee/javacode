package exam02;

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.setT("홍길동");								// String 타입
		String s = box.getT();							// casting 필요X
		
		Box<Integer> box1 = new Box<>();
		box1.setT(23);
		int i = box1.getT();
	}
}
