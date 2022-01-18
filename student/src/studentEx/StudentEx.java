package studentEx;

import java.util.Scanner;

public class StudentEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		StudentService service = new StudentService();
		
		for (boolean b = true ; b ;) {
			System.out.print("1.학생조회 2.학생등록 3.학생정보수정. 학생삭제. 5.종료 >> ");
			int input = Integer.parseInt(scanner.nextLine());
			
			switch (input) {
			case 1:
				service.list();
				break;
			case 2:
				service.register();
				break;
			case 3:
				System.out.println("학생 정보 수정입니다");
				
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
