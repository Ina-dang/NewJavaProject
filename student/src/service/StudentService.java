package service;

import static utils.StudentUtil.nextInt;
import static utils.StudentUtil.nextLine;

import java.util.ArrayList;
import java.util.List;

import domain.Student;


public class StudentService {
	
	// 01/17 : Student 필드 정의, main 메서드 메뉴 정리
	// 01/18 : 생성자 작성, 조회기능, 등록기능 구현
	// 01/19 : toString정의, 수정기능 구현
	// 01/20 : 패키지 분리, 
//			Student : student.domain에존재
//			StudentEx : student.app에 존재
//			StudentService : student.service에 존재
//			StudentUtil : student.utils에 존재
//						, 모든 필드에 private 적용 (get,set), 삭제 기능 구현
	// 01/21 : 이름등록제한, 점수범위
//	// 01/26
	
	//객체배열 인스턴스변수 
//	Student[] students = new Student[10]; //학생들 관리 배열을 어레이리스트로 변환
	//자바유틸 리스트 불러오기
	List<Student> students = new ArrayList<Student>(); //리스트타입 스튜던트 선언
	
	
	//220119 추가
	int cnt; // 인트타입 카운트. 여기에 현재학생인원수 담을거

	
	
	//220119 추가
	String[] names = {"김경보", "김동엽", "김상현", "김승종", "김예찬", "김치형", "김태윤"};
	
	//위쪽 220119 학번 다 다르게 다시 조정
	//초기화블럭 스튜던트 cnt값 수정됐음 + 랜덤넣어서 점수 값 다 다르게 출력할것 60~100사이로
	
	public StudentService() { //스튜던트서비스 생성자
		for (int i = 0; i < names.length; i++) {
//			students[i] = new Student(220000 + i + 1 + "", names[i], getScore(), getScore(), getScore());
			students.add(new Student(220000 + i + 1 + "", names[i]));
		} //for문은 항상 매서드 내에 있어야하고, print도 메서드 몸통에 있어야함 
	}	  // ,but {}블럭처리 해주면 생성자 내부로 인식돼서 가넝

	int getScore() {
		return (int)(Math.random()*41)+60;
	}
	
	

	// 1. 조회
	//모든 메서드는 void로 해서 리턴안함
	public void list() {
		//위에 들어간 학생데이터로 조회기능 구현
		System.out.println("학번\t   이름\t   국어\t  영어\t수학  총점   평균");
		System.out.println("========================================================");
		for (int i = 0; i < students.size(); i++) { //인스턴스 메서드끼리 는 클래스 안붙임
			
//	220119		// toString 사용해서 변경하셈 
			System.out.println(students.get(i));
		}
	}//void list() 끝
	
	
	
	// 2. 등록
	public void register() { //자동으로 리턴값 o, 생성자는 리턴값이 없다

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
//		System.out.print("학번>");
//		String no = StudentEx.scanner.nextLine();
		
		//2 입력받은 데이터를 학생타입의 인스턴스로 생성 ==> 1번 입력 다해야한다
		students.add(new Student(nextLine("학번> "), nextLine("이름> ", true), nextInt("국어>"), 
										nextInt("영어>"), nextInt("수학>")));
		
//220119		//3 students 배열의 cnt위치에 대입
//		students[cnt++] = student;
		//3 students 배열의 null위치에 대입

	}
//	Student student = new Student();s

	// 3. 수정
	
	public void modify(){ 
//		//학번으로 학생을 탐색 후 학생 데이터 중 이름 , 성적 수정

		Student student = findBy(nextLine("수정할 학생의 학번>"));
		if(student == null) {
			System.out.println("존재하지 않는 학번입니다");
			return;
		}
		student.setName(nextLine("이름 >", true));
		student.setKor(nextInt("국어>"));
		student.setEng(nextInt("영어>"));
		student.setMath(nextInt("수학>"));
	}//modify 끝
	
	
	
	
	// 4. 삭제
	
	public void remove() { 

//		int idx = findBy(nextLine("삭제할 학생의 학번 >> "));
//		if(idx == -1 ) {
//			System.out.println("존재하지 않는 학번입니다");
//					return;
			students.remove(findBy(nextLine("삭제할 학생의 학번 >> ")));
//		}
//		System.arraycopy(students, idx+1, students, idx, cnt-- - idx + 1);
		System.out.println("삭제되었습니다");
		// 학번을 입력받아 해당 학생의 내용을 삭제
		// [1, 2, null, 4, 5] >> [1, 2, 4, 5, 5] 실제로 들어있지만 cnt까지 탐색이라 결과적으론 [1, 2, 4, 5] 출력
		
//		[1, null, 3, 4, 5] 이러면 3이 나와야함 >> 5 - 2 = 3
//		[1, 2, null, 4, 5] >> 5 - 3 = 2
	}//remove 끝
	
	//remove == 학생을 받아서 찾겠다
	
	private Student findBy(String no) {
		Student student = null; 
		for( Student s : students ) { //배열 사이즈만큼만 순회
			if(s.getNo().equals(no)) { //s.getNo랑 no같으면 student출력
				student = s;
			}
		}
		return student;
		
	}
}
//		int idx = findIndexBy(no);
//		if ( idx == -1) {
//			return null;
//		}		
		
	
//	//해당 학생의 인덱스번째 리턴
//	private int findIndexBy(String no) {
//		int ret = -1; //(찾으면 해당번째 못찾으면 -1이 나와서 기준값을 -1로 잡음)
//		for (int i = 0; i < cnt; i++) {
//			if (students.get(i).getNo().equals(no)) {
//				ret = i;
//				break;
//			}
//		}
//		return ret;
//	}
