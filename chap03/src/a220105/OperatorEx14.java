package a220105;

public class OperatorEx14 {
	public static void main(String[] args) {
		char c = 'a';
		for(int i=0; i<26; i++); {
			System.out.print(c++);
		}	
		System.out.println();
			
		c = 'A';
		for(int i=0; i<26; i++);{
			System.out.print(c++);
		}	
		System.out.println();
		
		c = '0';
		for(int i=0; i<10; i++);{
			System.out.print(c++);
		}	
		System.out.println();	
		
		//�躻�� ���� 
		//�Ʒ��� �������� �����ѰͰ����ϴ�
		
		System.out.println('�R' - '��' + 1);
		
		System.out.println(11172 / 19f);
		
		for(int i = '��'; i < '��'; i++) {
			System.out.print((char)i);
		}
		
		System.out.println('a' - 'A');
		
	}
}
