package studentEx;

import java.util.Scanner;
import static utils.StudentUtil.*; 

public class StudentEx1 {
	public static Scanner scanner = new Scanner(System.in); //스캐너 클래스 변수 지정 후 광역사용
	public static void main(String[] args) {
		
		StudentService1 service = new StudentService1(); //StudentService타입의 service 인스턴스 객체 생성
		
		for (boolean b = true ; b ;) {
			
			int input = nextInt("1.학생조회 2.학생등록 3.학생정보수정. 학생삭제. 5.종료 >> ");
			
			switch (input) {
			case 1:
				service.list();
				break;
			case 2:
				service.register();
				break;
			case 3:
				service.modify();
				
				break;
			case 4:
				System.out.println("학생 삭제입니다");
				
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
		scanner.close();
	}
}
