package service;

import static utils.StudentUtil.nextInt;
import static utils.StudentUtil.nextLine;

import domain.Student;

public class StudentService1 { //기능
	
	//학생데이터
	Student[] students = new Student[10];

	
	int cnt; //현재 학생 인원수
	
	String[] names = {"김경보", "김동엽", "김상현", "김승종", "김예찬", "김치형", "김태윤"};
	
	
	public StudentService1() { //스튜던트서비스 생성자
		for (int i = 0; i < names.length; i++) {
			students[cnt] = new Student(220000 + cnt + 1 + "", names[cnt], getScore(), getScore(), getScore());
			cnt++;
		}
	}
	
	int getScore() {
		return (int)(Math.random()*41)+60;
	}
	
	//조회
	void list() {
		System.out.println("학번\t  이름\t  국어\t 영어\t 수학\t 총점\t 평균");
		System.out.println("======================================================");
		for (int i = 0; i < cnt; i++) {
				System.out.println(students[i]); // 이 주소값을 toString을 사용해 문자열로 반환
		}


	}
	
	//등록
	void register() { 
		
		students[cnt++] = new Student(nextLine("학번>"), nextLine("이름"), nextInt("국어"), 
				nextInt("영어"), nextInt("수학") );

	}
	//등록부분 끝
	Student student = new Student();
	
	//수정
	public void modify() { 
		//학번으로 학생을 탐색 후 학생 데이터 중 이름 , 성적 수정
		String no = nextLine("수정할 학생의 학번 >> "); 
		for (int i = 0; i < cnt; i++) {
			if (students[i].getNo().equals(no)) { //equals 확인
				System.out.println(students[i]);
				String name = nextLine("이름>");
				int kor = nextInt("국어>");
				int eng = nextInt("영어>");
				int math = nextInt("수학>");

				students[i].setName(name);
				students[i].setKor(kor);
				students[i].setEng(eng);
				students[i].setMath(math);
			}
		}
	}//modify 끝
	
	//삭제
	boolean flag = false;
	
	public void delete() {
		String no = nextLine("삭제할 학생의 학번 >>"); 
		for (int i = 0; i < cnt; i++) {
			if (students[i].getNo().equals(no)) { //equals 확인
				System.out.println(this.names + "을 삭제합니다");
				for (int j = 0; j < cnt-1; j++) {
					students[j] = students[j+1]; 
				}
				cnt--;
				flag = true;
				break;
			}
		}
	}
}
