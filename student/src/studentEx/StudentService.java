package studentEx;


class StudentService {
	
	//학생데이터
	Student1[] students = new Student1[10];

	
	int cnt; //현재 학생 인원수
	
	String[] names = {"김경보", "김동엽", "김상현", "김승종", "김예찬", "김치형", "김태윤"};
	
	
	public StudentService() { //스튜던트서비스 생성자
		for (int i = 0; i < names.length; i++) {
			students[cnt] = new Student1(220000 + cnt + 1 + "", names[cnt], getScore(), getScore(), getScore());
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
			if(students[i] != null) {
				//결과값
				System.out.println(students[i]); // 이 주소값을 toString을 사용해 문자열로 반환
			}
		}


	}
	
	//등록
	void register() { //StudentEx에서 scanner static 함
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
		
		Student1 student = new Student1(no, name, kor, eng, math);
		
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				break;
			}			
		}
	}
	
	//학번을 입력하고 학생을 찾고 무엇을 수정할지 고른후에 수정
	
	//수정
	void modify() {
		//학번으로 학생을 탐색 후 학생 데이터 중 이름 , 성적 수정
		//덮어쓰기
		System.out.print("정보를 수정할 학생의 학번을 입력해주세요 >> ");
		String no = StudentEx.scanner.nextLine();
		
		System.out.println("입력한 학생은" + "" + "입니다");
		System.out.print("어떤 정보를 수정하시겠습니까? \n1.이름 2.국어점수 3.영어점수 4.수학점수 >> ");
		int input = Integer.parseInt(StudentEx.scanner.nextLine());
		switch (input) {
		case 1:
			System.out.println("수정할 이름을 입력하세요");
			String name = StudentEx.scanner.nextLine();
			break;
		case 2:
			System.out.println("수정할 국어점수를 입력하세요");
			int kor = Integer.parseInt(StudentEx.scanner.nextLine());
			break;
		case 3:
			System.out.println("수정할 영어점수를 입력하세요");
			int eng = Integer.parseInt(StudentEx.scanner.nextLine());
			break;
		case 4:
			System.out.println("수정할 수학점수를 입력하세요");
			int math = Integer.parseInt(StudentEx.scanner.nextLine());
			break;

		default:
			System.out.println("잘못된 입력정보입니다.");
			break;
		}
		
	
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				break;
			}			
		}
		
		System.out.print("수정되었습니다. 수정된 입력값은" + input + "입니다.");
		
		
	}
	
	//삭제

}
