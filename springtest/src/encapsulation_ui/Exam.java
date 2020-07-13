package encapsulation_ui;

public class Exam {
	public Subject subject;

	public Exam() {
		subject = new Subject();
	}

	public int getKor() {
		return subject.getKor();
	}

	public void setKor(int kor) {
		if (kor < 0 || 100 < kor)
			subject.setEng(kor);
		subject.setEng(kor);
	}

	public int getEng() {
		return subject.getEng();
	}

	public void setEng(int eng) {
		if (eng < 0 || 100 < eng)
			subject.setEng(eng);
		subject.setEng(eng);
	}

	public int getMath() {
		return subject.getMath();
	}

	public void setMath(int math) {
		if (math < 0 || 100 < math)
			subject.setMath(math);
		subject.setMath(math);
	}

	public int getTotal() {
		return getKor() + getEng() + getMath();
	}

	public float getAvg() {
		return getTotal() / 3.0f;
	}

}