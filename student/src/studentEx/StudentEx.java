package studentEx;

import java.util.Scanner;

public class StudentEx {
	public static Scanner scanner = new Scanner(System.in); //��ĳ�� Ŭ���� ���� ���� �� �������
	public static void main(String[] args) {
		
		StudentService service = new StudentService(); //StudentServiceŸ���� service �ν��Ͻ� ��ü ����
		
		for (boolean b = true ; b ;) {
			System.out.print("1.�л���ȸ 2.�л���� 3.�л���������. �л�����. 5.���� >> ");
			int input = Integer.parseInt(scanner.nextLine());
			
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
