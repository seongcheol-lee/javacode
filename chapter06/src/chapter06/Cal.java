package chapter06;

public class Cal {
	double result;
	
	int add(int a, int b){
		return a+b;
	}
	
	double add(double a, double b) {
		return a+b;
	} // 메서드 오버로딩 : 이름은 같고 매개변수 형태는 다르게

	int add(String a, String b) {
		return Integer.parseInt(a)+Integer.parseInt(b);
	}
}
