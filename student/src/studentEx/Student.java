package studentEx;

class Student1 {//설계도
	
	//ava ctr mtd 순서
	
	// 학번, 이름, 국어, 영어, 수학
	String no;
	String name;
	int kor;
	int eng;
	int math;
	
	public Student1() {
		// TODO Auto-generated constructor stub
	}
	
	public Student1(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public Student1(String no, String name, int kor, int eng, int math) {
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
	
	//조회 출력부분
	public String toString() {
		String[] names = {"김경보", "김동엽", "김상현", "김승종", "김예찬", "김치형", "김태윤"};
		
		return String.format("%s \t %s\t  %d\t %d\t %d\t %d\t %s", no, name, kor, eng, math, sum(), avg());
	}
	
	//수정 출력부분 생성자 복사
	
	
}
