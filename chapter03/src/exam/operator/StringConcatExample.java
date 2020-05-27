package exam.operator;

public class StringConcatExample {
	public static void main(String[] args) {
		String str1 = "JDK" + 4 + 3.0;
		System.out.println(str1);
		String str2 = 4 + 3.0 + "JDK";
		System.out.println(str2);
	}
}