package a220103;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
	/*
	 * Scanner Ŭ������ ����Ϸ���
	 * import java.util.*; �� �Է��ϸ� �ȴ�
	 * ������ ������ ��ü��� �θ�
	 * 
	 * nextInt, nextFloat ���������� ��������
	 * 
	 */
	
		Scanner scanner = new Scanner(System.in); //�ܿ��! scanner ��ü(����) ����
		
		System.out.print("���ڸ� ������ �ϳ� �Է����ּ��� >>");
		String input = scanner.nextLine(); // nextLing() �Է� ������ > �Է��� ���� input�� ����	
		int num = Integer.parseInt(input); // �Է¹��� ���ڿ��� ���ڷ� ��ȯ 
										   // String Ÿ���� input�� int Ÿ���� num���� ��ȯ
		
		System.out.println("�Է³��� :" + input);
		System.out.printf("num=%d%n", num);
	}
}
