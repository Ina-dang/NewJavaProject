package studentEx;

class Student {
	//총점
	int sum() {
		return kor + eng + math;
	}
	//평균
	double avg() {
		return (int)(sum() / 3d * 100) / 100d;
	}
	
	// 학번, 이름, 국어, 영어, 수학
	String no;
	String name;
	int kor;
	int eng;
	int math;
	
	Student(){ //생성자
	
	}
}
