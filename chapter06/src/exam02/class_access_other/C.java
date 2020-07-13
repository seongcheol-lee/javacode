package exam02.class_access_other;

import exam02.class_access.B;

public class C {
	//A a;			// default 접근 제한 : 다른 패키지에서 접근 제한
	B b;			// public 접근 제한 : import하면 다른 패키지에서 쓸 수 있다
}
