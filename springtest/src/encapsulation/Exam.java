package encapsulation;

public class Exam {
	private int kor;
	private int eng;
	private int math;
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		if(kor < 0 || kor > 100)
			this.kor = 0;
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		if(eng < 0 || eng > 100)
			this.eng = 0;
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		if(math < 0 || math > 100)
			this.math = 0;
		this.math = math;
	}

}