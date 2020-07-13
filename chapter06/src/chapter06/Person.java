package chapter06;

public class Person {
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {	// 생성자(클래스와 이름 같음)
		this.ssn = ssn;
		this.name = name;
	}
}