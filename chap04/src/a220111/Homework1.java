package a220111;

public class Homework1 {
	public static void main(String[] args) {
		//영대문자 숫자로 조합된 20글자의문자
		char ch  = ' ' ;
		for(int i = 0; i<ch; i++) {
		
			int a  = (Math.random() * ch >= '0' && ch <='9'|| ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' ? 1 : 0);
			
			System.out.printf("%d", a);
		}
	}//char타입 65+26 97+26
	//ch >= '0' && ch <='9'|| ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z'
}
