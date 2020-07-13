package exam_interface;

public class A {
	X x;
//	public A(X x) {
//		this.x = x;
//	}
public X getX() {
		return x;
	}
	public void setX(X x) {
		this.x = x;
	}
	//	public static void main(String[] args) {
	public void print() {
//		B b = new B();
//		C c = new C();
//		X x = new B();							// 인터페이스 사용
//		X x = new C();							// 느슨한 결합
		
		System.out.println(x.getTotal());
		System.out.println(x.getTotal());
		System.out.println(x.getTotal());
	}
}
