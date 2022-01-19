package studentEx;

class Student {
	
	//ava ctr mtd 순서
	
	// 학번, 이름, 국어, 영어, 수학
	String no;
	String name;
	int kor;
	int eng;
	int math;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	//총점
	int sum() {
		return kor + eng + math;
	}
	//평균
	double avg() {
		return (int)(sum() / 3d * 100) / 100d;
	}
}
