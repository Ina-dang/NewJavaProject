package a220108;

public class Ch3_10 {
	/*
	 * ������ �빮�ڸ� �ҹ��ڷ� �����ϴ� �ڵ��ε�, ���� ch�� ����� ���ڰ�
	 * �빮���� ��쿡�� �ҹ��ڷ� �����Ѵ�
	 * �����ڵ�� �ҹ��ڰ� �빮�ں��� 32��ŭ �� ũ�� 
	 */
	public static void main(String[] args) {
		char ch = 'B';
		
		char lowerCase= (char)(( ch>='A' && ch <='Z') ? (ch+32) : ch);
		
		System.out.println("ch : "+ch);
		System.out.println("ch to lowerCase : "+lowerCase);
	}
}
