package a220111;

public class Homework1 {
	public static void main(String[] args) {
		//���빮�� ���ڷ� ���յ� 20�����ǹ���
		
		for(int i = 0; i<20; i++) {
		
			char a  = (char)((Math.random() * 45) + 46); 
			
			System.out.printf("%c", a);
		}
	} // '0':45-54 'A':65-91
}

