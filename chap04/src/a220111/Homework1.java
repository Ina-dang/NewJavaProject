package a220111;

public class Homework1 {
	public static void main(String[] args) {
		//���빮�� ���ڷ� ���յ� 20�����ǹ���
		char ch  = ' ' ;
		for(int i = 0; i<ch; i++) {
		
			int a  = (Math.random() * ch >= '0' && ch <='9'|| ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' ? 1 : 0);
			
			System.out.printf("%d", a);
		}
	}//charŸ�� 65+26 97+26
	//ch >= '0' && ch <='9'|| ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z'
}
