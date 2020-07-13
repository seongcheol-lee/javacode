package exam03.constructor_access;

public class B {
	A a1 = new A(true);
	A a2 = new A(1);
	//A a3 = new A("문자열");			// private 생성자 접근 제한: 다른 클래스에서 사용 X
}
