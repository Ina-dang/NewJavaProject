package studentEx;

import java.util.Scanner;
import static utils.StudentUtil.*; 

public class StudentEx1 {
	public static Scanner scanner = new Scanner(System.in); //��ĳ�� Ŭ���� ���� ���� �� �������
	public static void main(String[] args) {
		
		StudentService1 service = new StudentService1(); //StudentServiceŸ���� service �ν��Ͻ� ��ü ����
		
		for (boolean b = true ; b ;) {
			
			int input = nextInt("1.�л���ȸ 2.�л���� 3.�л���������. �л�����. 5.���� >> ");
			
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
				System.out.println("�л� �����Դϴ�");
				
				break;
			case 5:
				System.out.println("�����մϴ�");
				
				b = false;
				
				break;
	
			default:
				System.out.println("�ùٸ� ��ȣ�� �Է��ϼ���");
				break;
			}
		}
		scanner.close();
	}
}
