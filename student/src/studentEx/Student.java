package studentEx;

class Student {
	
	//ava ctr mtd ����
	
	// �й�, �̸�, ����, ����, ����
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
	
	//����
	int sum() {
		return kor + eng + math;
	}
	//���
	double avg() {
		return (int)(sum() / 3d * 100) / 100d;
	}
}
