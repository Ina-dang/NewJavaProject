package app;

import static utils.StudentUtil.*;
import java.util.Scanner;
import service.StudentService;

public class StudentEx { //Ex�� ����κ��� �ִٴ� ��
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) { //���θ޼��� �߿찡��
//		Student student = new Student(); // �̰� �л� �� �� �̶�� ��
//		student.no = "220001"; //�л����� �й� �ο�
//		student.name = "ȫ�浿";
//		student.kor = 90;
//		student.eng = 86;
//		student.math = 44;1
		
//		System.out.println(student); //�̷��� �ϸ� �ּҸ� ����
//		System.out.println(student.sum());
//		System.out.println(student.avg());
		
		StudentService service = new StudentService();
		
		
		for (boolean b = true ; b ;) { 
//		while(true) {
//			System.out.print("1.�л���ȸ 2.�л���� 3.�л���������. �л�����. 5.���� >> ");
//			int input = parseInt(scanner.nextLine());
			
			int input = nextInt("1.�л���ȸ 2.�л���� 3.�л���������. �л�����. 5.���� ");
			
			switch (input) {
			case 1:
				service.list();
				//StudentService class ���� �ν��Ͻ� ��������
				break;
			case 2:
				service.register();
				
				break;
			case 3:
				service.modify();
				
				break;
			case 4:
				System.out.println("�л� �����Դϴ�");
				
				break;
			case 5:
				System.out.println("�����մϴ�");
				
				b = false;
//				return;
				break;
				
			default:
				System.out.println("�ùٸ� ��ȣ�� �Է��ϼ���");
				break;
			
			}
		}
//		}
		scanner.close();
	}
}
