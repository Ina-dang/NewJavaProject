package a220112;

public class Ch4_09 {

	//���ڷ� �̷���� ���ڿ� �� ���� �� �� �ڸ��� ���� ���� ����� ����ϴ� str�ڵ带 �ϼ��϶�
	//���� ���ڿ��� "12345"���, ��1+2+3+4+5���� ����� 15�� ����� ��µ�
	//��� �Ѵ�. (1)�� �˸��� �ڵ带 �����ÿ�
	//string Ŭ���� charAt(int i) ���
	public static void main(String[] args) {
		System.out.println((int)"1".charAt(0)); //��Ʈ�γ���
		System.out.println("1".charAt(0)); //��Ʈ�γ���
		
		System.out.println("================");
		
		char c = "1".charAt(0);
		System.out.println(c);
		int i1 = "1".charAt(0);
		System.out.println(i1);
		
		System.out.println("================");
		
		String str = "12345";
		int sum = 0; 	
		for(int i = 0 ; i < str.length() ; i++) {
			System.out.println(str.charAt(i));
			sum += str.charAt(i) - '0' ;
			// char Ÿ���� �� '1'�� ���� 49�� ��µǾ 48�� ����� 1�� �˴ϴ�
			// �ε��� 0,1,2,3,4
			// ��Ʈ�� 1,2,3,4,5
			
		} 
		System.out.println("result :: " + sum);

//		char[] chs = str.toCharArray(); //�̰͵� ����Ѱ�
//		System.out.println(chs[2]);
	}
}
