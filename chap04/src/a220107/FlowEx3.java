package a220107;

import java.util.Scanner;

public class FlowEx3 { //if else
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("���ڸ� �Է��ϼ���. >>");
		
		int input = scanner.nextInt();
		
		if(input==0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�");
		} else { 
			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�");
		}
//////////////////���� ���ÿ� ��ġ�� �ؽ�Ʈ�� �ִ��� �ٿ�������
		
		System.out.print("���ڸ� �Է��ϼ���. >>");
		
		int input2 = scanner.nextInt();
		
		if(input2==0) {
			System.out.println("==0");
		} else { 
			System.out.println("!=0");
		}
		
		///////���� �� �� ��; ���� ��ģ��
		
		
		System.out.print("���ڸ� �Է��ϼ���. >>");
		
		int input1 = scanner.nextInt();
		System.out.print("�Է��Ͻ� ���ڴ� 0");
		
		if(input1==0) {
			System.out.println("�Դϴ�");
		} else { 
			System.out.println("�� �ƴմϴ�");
		}
		/////// �������� ���ߴ� ��
		// �������� ��..
		
		
		
		
		scanner.close();
	}
}
