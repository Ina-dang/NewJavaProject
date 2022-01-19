package studentTecher;

import java.util.Arrays;

// 클래스 설계도 그리는 시점에는 인스턴스가 없다는 걸 기억하고 인스턴스가 나중에 들어올 자리에 this로 이해

// 복사 copy 
// 복제 clone : 서로다른 인스턴스 주소를 가짐 주소는 다르지만 내부 인스턴스 변수의 값은 같음

public class Student {
	// 학번, 이름, 국어, 영어, 수학
	
	String no; 
	String name;
	int kor;               //==> int kor = 1; 명시적초기화  
	int eng;
	int math;
	
	{
		//인스턴스초기화
		//주로생성자사용
	}
	
	static {
		//클래스초기화
		//모든 ㅐㅇ성자에서 공통으로 수행돼야 하는 코드 넣을때 사용
	}
	
	
	
	
	
//	static String schoolName = "휴먼초등학교"; //위에 학생은 이름이 바뀌지만 학교 이름은 안바뀌니까 static
	
	//생성자 목적 : 인스턴스 초기화
	// 인스턴스 초기화 작업이 요구되어지지않는다면 각 값을 따로 입력해야함 => 코드 라인이 길어짐
	// 생성자 정의 순서 : 필드 -> 생성자(인자가 없는 기본생성자) -> 메서드
	
	//생성자 
//	Student(){}
//		
//	Student(String String, String String2, int k, int e, int m){
//		no = String;
//		name = String2;
//		kor = k;
//		eng = e;
//		math = m;
//	}
	
	// 위에 처럼 쓰면 괄호 String no라고 썼을때 서로 다른걸 가리키게된다
	// 
	public Student() {
		this("220003", "혼길돈", 80, 40, 30);
	}
	
	public Student(int kor, int eng, int math){
		this("220003", "혼길돈", 80, 40, 30);
	}
	
	public Student(String no, String name){
		this(70,70,70);
		this.no = no;
		this.name = name;
	}
	
	Student(String no, String name, int kor, int eng, int math){
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	} 
	
	//
	
	//총점, 평균
	int sum() {
		//입력값을 안적어두면 위에 kor, eng, math로 계산함
		//인스턴스 변수 내에서는 제한없이 쓸수 있다
		// this.kor으로 적어야하는데 this인스턴스 적어도 알아서 객체이름.sum 호출해서 생략가능 
		return kor + eng + math;
		
	}
	// sum 가능한 이유 = 저때 인스턴스 생성이 이루어졌기 때문
	
	double avg() {
		return (int)(sum() / 3d * 100) /100d;
	}
	
	//생성자 메서드 
//	Student student2 = new Student("220002", "고길동", 80, 70, 50);
	public static void main(String[] args) {
		Student student2 = new Student("220003", "혼길돈", 80, 40, 30);
		Student student3 = new Student(80, 90, 90);
		System.out.println(student2.no + "\t\t" + student2.name + "\t\t" + student2.kor + "\t" + student2.eng + "\t" + student2.math);
		System.out.println(student3.no);
		System.out.println(student3.name);
		System.out.println(student3.kor);
	
	
	int[] arr1 = {3,4,5,6};
	int[] arr2 = arr1; // 복사
	int[] arr3 = arr1.clone(); // 복제
	System.out.println(Arrays.toString(arr2));
	
//	Student student5= student3.clone(); //컨버트 안된다고 오류뜸
//	Student student5 = (Student)student3.clone(); //컨버트 안된다고 다른오류뜸
	
	}
}
