package a220113;

public class Ch5_10 {
	public static void main(String[] args) {
		char[] abcCode = //26��. ���ĺ���
			{ '`','~','!','@','#','$','%','^','&','*','(',')','-','_','+','=','|','[',']','{','}',';',':',',','.','/'};
	
						//  0   1   2   3   4   5   6   7   8   9
		char[] numCode = { 'q','w','e','r','t','y','u','i','o','p'}; //10
		
		String src = "abc123";
		String result = ""; //`~!wer
		
		// ���ڿ� src�� ���ڸ� charAt()���� �ϳ��� �о ��ȯ �� result�� ����
		for (int i = 0; i < src.length(); i++) { //0���� src ���̱��� 1�� �߰�
			char ch = src.charAt(i);
			ch = abcCode[i];

			
		}
		System.out.println("src:" + src);
		System.out.println("result:" + result);
	}
}
