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
	
	
	Student(String n, String n1, int k, int e, int m){ //생성자
			no = n;
			name = n1;
			kor = k;
			eng = e;
			math = m;

// sum, avg 어케넣
		}
}
