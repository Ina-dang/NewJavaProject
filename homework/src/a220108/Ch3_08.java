package a220108;

public class Ch3_08 {
	/*
	 * �Ʒ� �ڵ��� �������� �����ؼ� �������� ���� ����� �򵵷� �Ͻÿ�
	 */
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b); // (int)a,b�� byte�� ����ȯ �ؾ� ���������
		
		char ch = 'A';
		ch = (char)(ch + 2) ; // int�� char�� ����ȯ �ؾ� ���� �����
		
		float f = 3 / 2f ; // f �����־�� �Ҽ��� �ڿ� ����
		long l = 3000 * 3000 * 3000l; //l�����־�� int�����÷ο� �����
		
		float f2 = 0.1f;
		double d = 0.1; //���� ����ȯ�صε�
		
		boolean result = d!=f2; //�ΰ��� �ٸ��⶧��
		
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
		
		
	}
}
