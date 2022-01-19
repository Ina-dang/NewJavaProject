package studentTecher;

public class StudentService {
	
	// 01/17 : Student 필드 정의, main 메서드 메뉴 정리
	// 01/18 : 생성자 작성, 조회기능, 등록기능 구현
	// 01/19 : toString정의, 수정기능 구현
	
// 기능 담당 클래스
	//MVC Model View Controller
	/*
	 * 스프링 MVC 이해
	 * 
	 * Model
	 * 
	 * 브라우저를 통해 들어온걸
	 * 요청처리 컨트롤러로 하고
	 * DB처리 모델처리후 
	 * 뷰를통해 보여줌
	 * 
	 * 서비스 = business logic
	 */
	//객체배열 인스턴스변수 
	Student[] students = new Student[10]; //학생들 관리
	
	//220119 추가
	int cnt; // 인트타입 카운트. 여기에 현재학생인원수 담을거
		//이거 넣으면 장점
	
	
	//학생 데이터 여기에 들어갈 예정
	
//	↓ 이게 어려운이유	
	// Student 자체가 이미 참조자료형
	// []배열 도 참조자료형
	// 참조자료형을 참조했다
	
	// 사실 문자열 배열도 같은 내용이긴한데 String[] 한단계 벗기면 String 기본형이 되는데 저건 참졸 벗겨도 참조
	// 킹받음
	
	/*
	 * 어떠한 public 클래스에서도 출력 가넝
	 * 
	 * 맨밑에 main 만들어서 설명할것
	 */
	
//	public StudentService() { //StudentService 기본생성자 => 인자없이 할때 생성
//		// TODO Auto-generated constructor stub
//	}
	
//							  //초기화블럭
//	public StudentService() { //스튜던트서비스 생성자
//		for (int i = 0; i < 5; i++) {
//			students[i] = new Student("220001", "홍길동", 80, 80, 80);
//		} //for문은 항상 매서드 내에 있어야하고, print도 메서드 몸통에 있어야함 
//	}	  // ,but {}블럭처리 해주면 생성자 내부로 인식돼서 가넝
//	
	//220119 추가
	String[] names = {"김경보", "김동엽", "김상현", "김승종", "김예찬", "김치형", "김태윤"};
	
	//위쪽 220119 학번 다 다르게 다시 조정
	//초기화블럭 스튜던트 cnt값 수정됐음 + 랜덤넣어서 점수 값 다 다르게 출력할것 60~100사이로
	
	public StudentService() { //스튜던트서비스 생성자
		for (int i = 0; i < names.length; i++) {
			students[cnt] = new Student(220000 + cnt + 1 + "", names[cnt], getScore(), getScore(), getScore());
			cnt++;
		} //for문은 항상 매서드 내에 있어야하고, print도 메서드 몸통에 있어야함 
	}	  // ,but {}블럭처리 해주면 생성자 내부로 인식돼서 가넝
	
	
//	students[cnt++] = new Student("220001", "고길동", 80, 80, 80); //원래 이렇게 생겼다
//	students[cnt++] = new Student("220002", "이길동", getScore(), getScore(), getScore());
//	students[cnt++] = new Student(220000 + cnt + 1 + "", "고길동", getScore(), getScore(), getScore()); //원래 이렇게 생겼다
//	students[cnt++] = new Student("220003", "고길동", 80, 80, 80); //원래 이렇게 생겼다
	
	//220119 추가  랜덤값을 추가해서 위쪽 점수에 값초기화
	int getScore() {
		return (int)(Math.random()*41)+60;
	}
	
	
	
//	CRUD Create Read U? Delete
	// 1. 조회
	//모든 메서드는 void로 해서 리턴안함
	void list() {
		//위에 들어간 학생데이터로
		//조회기능 구현

		System.out.println("학번\t\t이름\t\t국어\t영어\t수학\t총점\t평균");
		System.out.println("=====================================================================");
//		for (int i = 0; i < cnt; i++) { //인스턴스 메서드끼리 는 클래스 안붙임
		for (int i = 0; i < students.length; i++) { //인스턴스 메서드끼리 는 클래스 안붙임
			if(students[i] != null) { //null이 아닐때.
//			System.out.print(students[i].no);
//			System.out.print("    ");
//			System.out.print(students[i].name);
//			System.out.print("    ");
//			System.out.print(students[i].kor);
//			System.out.print("    ");
//			System.out.print(students[i].eng);
//			System.out.print("    ");
//			System.out.print(students[i].math);
//			System.out.print("    ");
//			System.out.print(students[i].sum());
//			System.out.print("    ");
//			System.out.print(students[i].avg());
//			System.out.println();
			System.out.print(students[i].no + "\t\t" + students[i].name + "\t\t" + students[i].kor + "\t" + students[i].eng + "\t" + students[i].math + "\t" + students[i].sum() + "\t" + students[i].avg() +"\n" );

			
//	220119		// toString 사용해서 변경하셈 
			
			
			}//이렇게 하나하나 적어야 하는거였구나 
		} //null 확인하고 초기화 시키고 .. 순서가 너모헷갈립니다
	}
	
	// 2. 등록
	void register() { //자동으로 리턴값 o, 생성자는 리턴값이 없다

		//등록기능 구현
		
		//어디서 값을 받아서 어떤 형식으로 구현할 것인지 확실하게 정해야 함
		//최종적으로 입력받은 인스턴스는 public class Student 형식으로
		// 내 학생들 students 에 저장해야함
		// 몇번째위치에? 
		
		/* 해야할 순서
		 * 1. 데이터 입력받기 ==> Scanner 클래스 instance로 입력을 받음
		 * 스캐너를 클래스 변수로 해놓으면
		 * StudentEx.scanner.nextLine();을 해올 수 있다
		 * 2. 입력받은 데이터를 Student 타입의 인스턴스로 생성
		 * 3. students 배열의 null 위치에 대입
		 */
		
		//1 데이터 입력받기
		System.out.print("학번>");
		String no = StudentEx.scanner.nextLine();
		System.out.print("이름>");
		String name = StudentEx.scanner.nextLine();
		System.out.print("국어>");
		int kor = Integer.parseInt(StudentEx.scanner.nextLine());
		System.out.print("영어>");
		int eng = Integer.parseInt(StudentEx.scanner.nextLine());
		System.out.print("수학>");
		int math = Integer.parseInt(StudentEx.scanner.nextLine());
		//2 입력받은 데이터를 학생타입의 인스턴스로 생성 ==> 1번 입력 다해야한다
		Student student = new Student(no, name, kor, eng, math);
//220119		//3 students 배열의 cnt위치에 대입
//		students[cnt++] = student; 로 변경
		//3 students 배열의 null위치에 대입
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				break;			
			}
		}
	}
	
	
	// 3. 수정
	void modify() {
		//학번으로 학생을 탐색 후 학생 데이터 중 이름 , 성적 수정
		//덮어쓰기
	}
	
	// 4. 삭제
	
	
	
	
	////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		/*
		 * 
		 * 위에 있는 students에 
		 * new를 만들어서 인스턴스 생성할거임
		 */
		
		
		//근데 위치 어딘지 잘봐야함. 지금 있는곳 studentService임
		StudentService service = new StudentService(); //이거 생성해야지 students[i]사용가능
//		System.out.println(service.students[]);
		
		
// 		초기화 시킴
//		service.students[0] = new Student("220002", "고길동", 70, 60, 50);
		//초기화 안시키고.no 하면 nullpointexception뜸
	
		
//		//조회기능구현
//		for (int i = 0; i < service.students.length; i++) {
//			System.out.println(service.students[i]);
//		}
		
//		System.out.println(service.students[0].no); //생성자 호출시 
//		service.students[0] ==> 위쪽 Student
		
		service.list();
		
		
		
		// StudentService클래스의 Student[]배열타입이다
		// service.students의 타입 = Student[] 배열타입
		
		
	}
}
