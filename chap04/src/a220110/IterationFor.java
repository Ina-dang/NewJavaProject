package a220110;

public class IterationFor {
	public static void main(String[] args) {
//		�� ������ �����ݷ����� ����
//		for(1�ʱ�ȭ;2���ǽ�;4������){
//					3����
//		}
		
		// ������� �� Ȯ���ϱ� (�ʱ�ȭ�����ǽġ湮���������)
		
		for(int i = 1; i <= 2 ; i++) {
			System.out.println("�ȳ���������");
		}
		for(int i = 1; i <= 5 ; i+=2) {
			System.out.println("�ȳ�");
		}
		for(int i = 1; i <= 8 ; i*=2) {
			System.out.println("hi");
		}
		for(int i = 10; i > 0 ; i--) { //i-- == i-=1
			System.out.println(i);
		}
		System.out.println("======================");
		for(int i = 0; i <= 100 ; i+=5) { 
			System.out.println(i);
		}
		System.out.println("======================");
		for(int i = 0; i <= 20 ; i++) { 
			System.out.println(i);
		}
		System.out.println("======================");
		for(int i = 2 ; i <= 9 ; i ++) { //8 
			for(int j = 1 ; j <= 9 ; j++) { //9
				//���ϴ� ���ڵ��� ��ø�ݺ����� ��������
				System.out.println(i + "*" + j + "=" + i*j);
			}
		}	
	}
}
