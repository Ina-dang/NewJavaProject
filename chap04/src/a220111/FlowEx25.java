package a220111;

import java.util.Scanner;

public class FlowEx25 {
	public static void main(String[] args) {
		int num = 0, sum = 0;
		System.out.print("���ڸ� �Է��ϼ���. (��:12345)>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		num = Integer.parseInt(tmp); //�Է¹��� ���ڿ�tmp�� num���� ��ȯ
		
		while(num != 0) { //num�� 0�� �ƴҶ����� �ݺ��� ������ �ݺ��ҰŴ�
			// num�� 10���� ���� �������� sum�� ����
			sum += num % 10; 
			// sum = sum + num % 10 
			//        0  + 12345 % 10
			System.out.printf("sum =%3d num %d%n", sum, num);
//			System.out.println(num%10);
			num /= 10; // num = num / 10; num�� 10���� ���� ���� �ٽ� num�� ����
		}
				System.out.println("�� �ڸ����� ��:" + sum);
				scanner.close();
	}
}
