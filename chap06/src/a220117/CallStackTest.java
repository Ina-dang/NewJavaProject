package a220117;

public class CallStackTest {
	public static void main(String[] args) {
		System.out.println("main 1");
		firstMethod(); //static�޼���� ��ü �������� ȣ�� ���� 
		//main1 ȣ��ڿ� fristMethod Ŭ������ ���� /first1 second first2 main2/ �ϰ� main2
		System.out.println("main 2");
	}
	
	static void firstMethod() {
		System.out.println("first 1");
		secondMethod();
		System.out.println("first 2");
	}
	static void secondMethod() {
		System.out.println("second");
	}
}
