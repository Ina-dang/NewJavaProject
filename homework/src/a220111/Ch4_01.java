package a220111;

public class Ch4_01 {
	public static void main(String[] args) {
		int x = 10;
//		������ ���� �ȳ��� �ϴ� �� ��θ� ����
//		int �� ���� x �� 10���� ũ�� 20���� ������ true�� ���ǽ�
		boolean b1 = x > 10 && x < 20 ;
		System.out.println(b1);
//		char�� ���� ch�� �����̳� ���� �ƴҶ� true �� ���ǽ�
		char ch = ' ';
		boolean b2 = ch != ' ' || ch != '\t';
		System.out.println(b2);
//		char�� ���� ch�� 'x'�Ǵ� 'X'�϶� true �� ���ǽ�
		boolean b3 = ch =='x' || ch == 'X';
		System.out.println(b3);
//		char�� ���� ch�� ����('0'~'9')�϶� true �� ���ǽ�
		boolean b4 = ch >= '0' && ch <= '9';
		System.out.println(b4);
//		char�� ���� ch�� ������(�빮�� �Ǵ� �ҹ���)�϶� true �� ���ǽ�
		boolean b5 = ch >= 'A' && ch <='Z' || ch >= 'a' && ch <= 'z';
		System.out.println(b5);
		boolean b6 = ch >= 'A' && ch <= 90 || ch >= 'a' && ch <= 'Z'+32;
		System.out.println(b6);
//		int�� ���� year�� 400���� ���� �������ų� 4�� �������� 100���� ������������������ Ʈ��
		int year = 0;
		boolean b7 = year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
		System.out.println(b7);
//		boolean �� ���� powerOn�� false�϶� true �� ���ǽ�
		boolean powerOn = !(1 > 3);
		System.out.println(powerOn);
		/*
		 * �� ��
		 * boolean powerOn = false;
		 * boolean b8 = !powerOn;
		 */
//		���ڿ� �������� str�� yes �϶� true�� ���ǽ�
//		int a = 3;
//		String str = a >= 3 ? "yes" : "false"; 
//		System.out.println(str);
//		String str = "yes";
//		boolean b9 = str.equals("yes");
		
//		int value = (int)(Math.random() * 6) + 1 ;		
	}
}
