package a220104;

public class Casting { //����ȯ(casting)
	public static void main(String[] args) {
		/*
		 * ����ȯ : ���� �Ǵ� ����� Ÿ���� �ٸ� Ÿ������ ��ȯ�ϴ� ��
		 * ����ȯ ��� : (type)�ǿ����� 
		 * 
		 * int score = d; type missmatch��� ���� >> double�� int���� ũ�⶧��
		 * 
		 */
		
		double  d = 85.4;
		int score = (int)d; // double type ����d�� int type���� casting
		
		System.out.println("score=" + score); // ����d�� int type casting 
		System.out.println("d=" + d);		  // casting ��� 85�� ���� score save
		// ����ȯ �Ŀ��� �ǿ����ڿ��� �ƹ��� ��ȭ�� ����.
		
		int ch = (int)'A';
		System.out.println(ch);
		
				  // (string)d  --> �������� �⺻������ ����ȯ �Ұ�
		String str = d + ""; // ""�� ���ؼ� ���ڿ� ȭ ��Ų�� ..a220103 StringEx ����
	  // String str = String.valueOf(d); �� �ᵵ ���� �� ����
		System.out.println(str);
	  // str > double
		double d2 = Double.parseDouble(str); //scanner part ���� �غ���
		
		System.out.println("===���������� ����ȯ===");
		System.out.println(300);
		System.out.println((byte)300); //p75
		System.out.println(d2);
		
		byte b = -2;
		int  i = b; // int���� byte�� �۾Ƽ� ����
		
		System.out.println(i);
		
		// ����� ����ȯ / ������ ����ȯ
		// 				   ������� ����ȯ�� �Ͼ���� ������ ���� ���� ������ �����ϴ�

		int   i2 = 10;
		//1010 = 1.01 * 2^3 (�Ҽ���3�� ������)
		//      ���� ���� ���ɰ���ϴ�
		float f  = i2; //10.0f , ����ȯ ������ ��� x
		float f2 = 3.14f; 
		
		System.out.println(f);
		System.out.println(f2); //�Ǽ����� ���������� ����ȯ�ϸ� �ݿø� x
		
		int i3 = (int)f;
		
		System.out.println(i3);
		
		/* long(8byte) > float(4byte) : ũ������δ� long�� �� ū�� ����Ÿ�����θ� �����ؼ�
		 *								���ð���
		 * float(4byte) > long(8byte)
		 * 
		 */
		
		long  l  = (long)f;
		float f3 = l;
		
		System.out.println(l);
		System.out.println(f3);
		
		/*
		 * char <> short ���� ����ȯ�� ���� (��ȣ�� 2����Ʈ�� ������ ǥ������ ������ �ٸ�)
		 * �� ���� ����ȯ �ʿ�
		 */
		
		// p83 �⺻���� �ڵ� ����ȯ�� ������ ���� Ȯ��
		
		// 1. boolean�� ������ ������ 7���� �⺻���� ���� ����ȯ�� �����ϴ�.
		// 2. �⺻���� �������� ���� ����ȯ�� �� ����.
		// 3. ���� �ٸ� Ÿ���� �������� ������ ����ȯ�� �ϴ°��� ��Ģ������,
		//    ���� ������ ���� Ÿ�Կ��� ū Ÿ�������� ����ȯ�� ������ �� �ִ�.
		// ���������� �ڵ��ʺ����͵� cafe.naver.com/javachobostudy.cafe ���� �ǉX����
		
		
	}
}
