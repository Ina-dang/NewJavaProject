package a220108;

public class Ch3_09 { 
	/*
	 * ������ ���� ch�� ������ �̰ų� ������ ���� ���� b�� ���� true�� �ǵ��� �ϴ� �ڵ�
	 */
	public static void main(String[] args) {
		char ch = 65 ;
		boolean b = ( (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'a') || (ch >= '0' && ch <= '9') );
				
		System.out.println(b);
	}
}
