package a220106;

public class OperatorEx23 {
	public static void main(String[] args) {
		String str1 = new String("abc"); //�����ڷ��� ���� Ư���ؼ� ���ͷ�(������)�� ���� �� ����
		String str2 = new String("abc"); //new ������ ���Ĺ���
//		�����ڷ����� �ּҸ� ���Ѵ�
		
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc"); // "" ����ǥ ���̿� " �������� \" �� �Է� �ؾ��Ѵ�
		System.out.printf(" str1==\"abc\" ? %b%n",    str1== "abc");
		System.out.printf(" str1==\"abc\" ? %b%n",    str2== "abc");
//		System.out.printf(" str2==\"abc\" ? %b%n",    str2 = new String("abc")); //new string �̶� ��ü�� �ٸ� 
		System.out.printf(" str1.equals(\"abc\") ? %b%n",    str1.equals("abc"));
		System.out.printf(" str2.equals(\"abc\") ? %b%n",    str2.equals("abc"));
		System.out.printf(" str2.equals(\"abc\") ? %b%n",    str2.equals("ABC")); //equals()�� ��ü�� �޶� ���븸 ������ true����
		System.out.printf(" str2.equalsIgnoreCase(\"ABC\") ? %b%n",    str2.equalsIgnoreCase("ABC"));
		
		System.out.println("\"������\""); //����ǥ �־ ����ϴ� ��
	}
}
