package app;

import static utils.StudentUtil.*;
import service.StudentService;

public class StudentEx { //Ex가 실행부분이 있다는 뜻
	public static void main(String[] args) { //메인메서드 추우가아
//		Student student = new Student(); // 이게 학생 한 명 이라는 뜻
		
//		System.out.println(student); //이렇게 하면 주소만 나옴
//		System.out.println(student.sum());
//		System.out.println(student.avg());
		
		StudentService service = new StudentService();
	
		
		for (boolean b = true ; b ;) { 
			
			int input = nextInt("1.학생조회 2.학생등록 3.학생정보수정 4.학생삭제 5.종료 ");
			
			switch (input) {
			case 1:
				service.list();
				//StudentService class 위에 인스턴스 생성했음
				break;
			case 2:
				service.register();
				
				break;
			case 3:
				service.modify();
				
				break;
			case 4:
				service.remove();
				
				break;
			case 5:
				System.out.println("종료합니다");
				
				b = false;

				break;
				
			default:
				System.out.println("올바른 번호를 입력하세요");

				break;
			}
		}

	}
}
