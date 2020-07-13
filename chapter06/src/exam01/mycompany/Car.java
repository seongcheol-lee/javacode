package exam01.mycompany;			// 패키지 : 클래스를 구분, 관리하는 폴더 개념

import exam01.hankook.SnowTire;
import exam01.hyndai.Engine;
import exam01.kumho.BigWidthTire;

public class Car {
	//exam01.hyndai.Engine engine = new exam01.hyndai.Engine();
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
}