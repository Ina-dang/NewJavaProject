package a220114;

public class Ex13String0xToBin { //16������ 2������
	public static void main(String[] args) { //�޼��� = ���
		char[] hex = { 'C', 'A', 'F', 'E', }; // 16���� 12, 10, 16, 15
		
		String[] binary = { "0000", "0001", "0010", "0011", 
							"0100", "0101", "0110", "0111", 
							"1000", "1001",	 //'0' ~ '9'
							"1010", "1011",	"1100", "1101", "1110", "1111", }; //'A' ~ 'F'
		
		String result = "";
		
		for (int i = 0; i < hex.length; i++) {
			if (hex[i] >= '0' && hex[i] <= '9') { //'0' ���� '9'���� ������ �������� ���
				result += binary[hex[i]-'0'];		// '8'-'0'�� ����� 8�̴�.
				//���ڴ� �׳� ���⼭ '0'���� ��
			} else { 	// A~F�̸�
				result += binary[hex[i]-'A'+10];						
			}					// �����ϰ�� 'A' - 'A' + 10 , 'C' - 'A'�� ����� 2
		}
									// String(char[] value)
		System.out.println("hex:" + new String(hex));
		System.out.println(hex); //println �� (char)�����Ŵ� �ּҾȳ����� ���ڿ��� ���
		System.out.println("hex:" + hex); //�̰� �ּҳ���
		System.out.println("binary:" + result);
		
//		���ڿ� : ���ڸ� ���̾� �þ���� �� (String types)
//			== ���ڹ迭�� char�迭�� ���� ��
//		�׷��� �ٸ����� �ִµ�
//		String��ü(���ڿ�)�� �������� ���� �� ������ ������ �� ����
		
		String str2 = "ab" + "cd"; //ab , cd, abcd�� �����ϰԵ�
//		���ڿ��� ������ �� �����Ƿ� ���ο� ������ ���ڿ��� �����ȴ�
//		����
		String str3 = "Java";
		str3 = str3 + "8";			//"Java8"�̶�� ���ο� ���ڿ��� str�� ����ȴ�
		System.out.println(str3);	// "Java8" �� ��µ����� "Java", "8", "Java8"�� ����ȴ�
		
		String str = "CAFE";
		String r   = str.substring(2); //2��° ���� �߶��ּ���
		System.out.println(r); // CAFE�� CA�߸� FE�� ��� 

		String str1 = "https://www.naver.com";
		String r2   = str1.substring(12); //12��° ���� �߶��ּ���
		System.out.println(r2); // naver.com ���
		System.out.println(str1.substring(12, 17)); // 12������ 17�������� ������ּ��� naver�� ���
//														 �̻�     �̸�(17�� ��¾���) �̶�� ��
		
				
	}
}
