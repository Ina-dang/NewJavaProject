package a220103;

public class PrintfEx1 {
	public static void main(String[] args) {
	/*
	 * println >> ����ϱ⿣ �������� ������ ���� �״�� ����ϹǷ�
	 * 			  ���� ��ȯ���� �ʰ�� �ٸ� �������� ����� �� ����
	 * prinf >> ���� .. ���� ���̶� �ٸ� �������� ����ϰ� ���� �� ���
	 * 			ex) ������ 16������ 8������ ����Ѵٴ���
	 *			
	 *'������(specifier)'�� ���� ������ ���� ���� ���� �������� ��ȯ�Ͽ� ����ϴ� ���
	 * specifier >> ���� ��� ����� ������ �������ִ� ����
	 * 
	 * printf() specifier �� ���� ����ϴ� ��
	 * 	 %b     - boolean �������� ���
	 * 	 %d     - decimal(10��) ������������ ���
	 * 	 %o     - octal(8��) ������������ ���
	 * 	 %x, %X - hexa-decimal(16��) ������������ ���
	 *   %f 	- floating-point(�ε� �Ҽ���) �������� ���
	 *   %e, %E - exponent(����) ǥ������ �������� ���
	 *   %c 	- character(����)�� ���
	 *   %s		- string(���ڿ�)�� ��� 
	 *   
	 *   |����| �������� ��ü ����� ������, Java API���� FormatterŬ���� (java,utill��Ű���� ã���� �ȴ�)
	 *  
	 */
	byte b = 1;
	short s = 2;
	char c = 'A';
	
	int finger = 10;
	long big = 100_000_000_000L; // long big =100000000000L;
	long hex = 0xFFFF_FFFF_FFFF_FFFFL ; //int ��������� �Ѿ long��� (int ������� 21��)
	
	int octNum = 010;		//  0  = 8���� 10, 10�����δ� 8
	int hexNum = 0x10;		//  0x = 16���� 10, 10�����δ� 16
	int binNum = 0b10; 		//  0b = 2���� 10, 10�����δ� 2
	
	//������(specifier)�� %�� ǥ��
	//�������� ���� ����Ҷ� %d���
	System.out.printf("b=%d%n", b); 
	System.out.printf("s+%d%n", s);
	System.out.printf("c=%c, %d %n", c, (int)c); 
	/*
	 * //("c=%c, %d %n", c, (int)c)
	 * (int)c = char Ÿ���� int�� ��ȯ�ϰڴ�. ����ȯ
	 */	
	System.out.printf("finger=[%5d]%n", finger);
	// ��°����� 5ĭ Ȯ���ϰڴ� [%5d]
	System.out.printf("finger=[%-5d]%n", finger);
	// ���� ���� �� 5ĭ�� Ȯ���ϰڴ� [%-5d]
	System.out.printf("finger=[%05d]%n", finger);
	// ����ִ°����� 0���� ä��ڴ� [%05d]
	System.out.printf("big=%d%n", big);
	// �򿡴��Ѱ��� 10������ ����ϰڴ�
	System.out.printf("hex=%#x%n", hex); // '#'�� ���λ�(16����) 0x, 8���� 0)
	// �U�����Ѱ��� 16������ ����ϰڴ�
	System.out.printf("octNum=%o, %d%n", octNum, octNum);
	System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
	System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);
	// %b�� ��� Integer.toBinaryString���� ���ڿ��� ����ؾ���
	
	//%n ��� \n�� ����ص� ������, OS���� �ٹٲ� ���ڰ� �ٸ� �� �ֱ� ������ %n�� ����ϴ� ���� ����
	
	String str = "12345678901234567890"; 
	
	System.out.printf("[%s]%n", str);
	System.out.printf("[%30s]%n", str);
	System.out.printf("[%-30s]%n", str);
	System.out.printf("[%.5s]%n", str); // 5��°������ ��� �� ����
	
	}
}
