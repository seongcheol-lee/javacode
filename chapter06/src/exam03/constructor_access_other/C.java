package exam03.constructor_access_other;

import exam03.constructor_access.A;

public class C {
	A a1 = new A(true);				// public 생성자 : import하면 다른 패키지에서 쓸 수 있다
	//A a2 = new A(1);				// default 생성자 접근 제한 : 다른 패키지에서 사용 X
	//A a3 = new A("문자열");			// private 생성자 접근 제한
}
