package chapter11;

public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();		// 객체를 바꾸지 않고 내용만 바꾸고 사용
		
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb);
//		System.out.println(sb.toString());			// toString 생략 가능
		
		sb.insert(4, "2");
		System.out.println(sb);
	}
}
