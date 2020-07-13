package chapter11;

public class StringSplitExample {
	public static void main(String[] args) {
//		String text = "홍길동&이수홍,박연수,김자바-최명호";
//		String[] names = text.split("&|,|-");
		String[] result = "홍길동&이수홍,박연수,김자바-최명호".split("&|,|-");
		
		for(String s : result) {			// s : 매개변수
			System.out.println(s);
		}
	}
}
