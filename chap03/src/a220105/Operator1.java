package a220105;

import java.util.*;

public class Operator1 { //p97~ ���������~
	public static void main(String[] args) {
		
		// �� ������ �Է� �޾� ��Ģ���� ����� ����Ͻÿ� - ������
		int a = 10;
		int b = 4;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("ù��° ���� �Է��ϼ���>>"); //�Է��� �� �ִ� �޽����� �ٶ��� println���� print��
		a = Integer.parseInt(scanner.nextLine());
		
		System.out.print("�ι�° ���� �Է��ϼ���>>");
		String input = scanner.nextLine();
		b = Integer.parseInt(input);

		System.out.printf("%d + %d = %d%n", a, b, a + b);
		System.out.printf("%d - %d = %d%n", a, b, a - b);
		System.out.printf("%d * %d = %d%n", a, b, a * b);
		System.out.printf("%d / %d = %d%n", a, b, a / b);
		System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b); 
		
		// �� ������ �Է� �޾� ��Ģ���� ����� ����Ͻÿ� - ��Ÿ�ð��Ѱ�
		/*Scanner scanner = new Scanner(System.in);
		
		System.out.print("�� ������ �Է� �޾� ��Ģ���� ����� ����Ͻÿ�");
		String input = scanner.nextLine();
		int a = Integer.parseInt(input); // �Է¹��� ���ڿ��� ���ڷ� ��ȯ
		int b = Integer.parseInt(input); // �Է¹��� ���ڿ��� ���ڷ� ��ȯ
		int num = Integer.parseInt(input); // �Է¹��� ���ڿ��� ���ڷ� ��ȯ
		
		System.out.println("�Է³��� :" + input);
		System.out.printf("num=%d + %d = %d%n", num, a, b, a - b);
		*/
				
		
		System.out.println("=====================================================");
		
		// 9 / 4 = 2 . . 1  | 1 + 2 * 4 = 9
		// ���� 0
		
		//�������Ҷ� ����(�����¼�)�� 0�� �Ǵ°�� 
		// 8 / 2 = 4 		| 4 * 2 = 8
		
//		System.out.println(3/0); Exception in thread "main" java.lang.ArithmeticException: / by zero ��������
		
		//�Ǽ��� ������ �ణ�� ����� ����
		System.out.println(3/0d); // �������� 0�� �ƴѰ�� Infinity		(d, f�Ѵ�) 
		System.out.println(0/0f); // �������� 0�� ���	   Not a Number (���ڴ� �´µ� ������ �� ���� ��)
		
		//java���� �Ǽ� �ڷ��� �� �ȽἭ ���� �� �� ����
		
		byte a1 = 10;
		byte b1 = 30;
//		byte c1 = a1 + b1; ������ ������ �߻��Ѵ�. ��������� ����ȯ �ʿ�
//						 a,b 
		byte c1 = (byte)(a1 * b1);
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c1);
		
		scanner.close();
		
	}
}
