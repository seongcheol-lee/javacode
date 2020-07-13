package exam03;

public class ProductExample {
	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<Tv, String>();
		product1.setKind(new Tv());
		product1.setModel("스마트TV");
		Tv tv = product1.getKind();						// Tv 객체 리턴
		String s = product1.getModel();					// String 객체 리턴
	}
}
