package a220105;

import java.util.*; // Scanner Ŭ���� ����ϱ����� �߰�
public class ScannerPrac {
	public static void main(String[] args) {
			
	Scanner scanner = new Scanner(System.in); // ScannerŬ���� ��ü ����
	
//	int a = ' ';
//	int b = ' ';
//	int c ; //���� �ص���
	
	System.out.print("ù��° ���ڸ� �Է��ϼ���");
	String input = scanner.nextLine();
	int a = Integer.parseInt(input); // int �Է��ϸ� �ߺ������̶� ��������. (���� ������ ������ int �Է�)

	System.out.print("�ι�° ���ڸ� �Է��ϼ���");
	String input1 = scanner.nextLine();
	int b = Integer.parseInt(input1);
	
	System.out.print("����° ���ڸ� �Է��ϼ���");
	int c = Integer.parseInt(scanner.nextLine());
	
	System.out.printf("%d + %d + %d = %d%n", a, b, c, a + b + c);
	System.out.printf("%d - %d - %d = %d%n", a, b, c, a - b - c);
	System.out.printf("%d * %d + %d = %d%n", a, b, c, a * b + c);

	
	//�Ϲ� �⺻ �޼���� �˾Ƽ� �����
	// ���� Ÿ�� Ư�� io �迭�� overhead(��������)�� ���ؼ� �ڿ��� ����Ѵٰ� �ν��Ͻ��� ���������� �ڿ��� �����Ҷ� ��������� �������
	// �̰� �Ⱦ��ٰ��ؼ� ��û ū������ ������ ���� (�츮�� �����Ѱ� �ݹ� �����ߴٰ� �ݹ� �����°Ŵϱ�)
	// �ٵ� ����ó�� ���������� �����ؾ��ϴ� �ѹ������ϰ� �����°Ծƴ϶� ��������־���ϴ°Ŵ�
	// �������. ����� �ֵ��� ���� ���߿� �� ���
	
//	System.out.printf("%d / %d = %d%n", a, b, a / b);
//	System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b); 
	
	System.out.println("���ڸ� �Է��ϼ���");
	int d = Integer.parseInt(scanner.nextLine());
	
	System.out.println(d % 2 == 0 ? "¦��" : "Ȧ��");
	
	scanner.close();	
	}
}
