package studentTecher;

//
public class Student {
	// 학번, 이름, 국어, 영어, 수학
	
	String no; 
	String name;
	int kor;
	int eng;
	int math;
	
//	static String schoolName = "휴먼초등학교"; //위에 학생은 이름이 바뀌지만 학교 이름은 안바뀌니까 static
	
	Student(Student stu){
		no = stu.no;
		name = stu.name;
		kor = stu.kor;
		eng = stu.eng;
		math = stu.math;		
	}
	
	Student(String no, String name, int kor, int eng, int math){
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	} 
	//수정이 필요한 경우 유지보수가 쉬워짐 ==> 왜 
	//this.no 인스턴스 변수
	//no 	  매개변수로 정의된 지역변수
	
	
	
	
	//총점, 평균
	int sum() {
		//입력값을 안적어두면 위에 kor, eng, math로 계산함
		//인스턴스 변수 내에서는 제한없이 쓸수 있다
		return kor + eng + math;
		
	}
	// sum 가능한 이유 = 저때 인스턴스 생성이 이루어졌기 때문
	
	double avg() {
		return (int)(sum() / 3d * 100) /100d;
	}
	
}
