package chapter06;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "AAA");
		
		//p1.nation = "USA";			// final 필드 : 수정 불가능
		//p1.ssn = "654321-7654321";	// final 필드 : 수정 불가능
		p1.name = "BBB";
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
	}
}