package a220113;

public class Ch5_10 {
	public static void main(String[] args) {
		char[] abcCode = //26��. ���ĺ���
			{ '`','~','!','@','#','$','%','^','&','*','(',')','-','_','+','=','|','[',']','{','}',';',':',',','.','/'};
	
						//  0   1   2   3   4   5   6   7   8   9
//		System.out.println(abcCode.length); // ��ΰ� Ȯ��

		char[] numCode = { 'q','w','e','r','t','y','u','i','o','p'}; //10
		
		String src = "abc123";
		String result = ""; //`~!wer
		
		// ���ڿ� src�� ���ڸ� charAt()���� �ϳ��� �о ��ȯ �� result�� ����
		for (int i = 0; i < src.length(); i++) { //0���� src ���̱��� 1�� �߰�
			char ch = src.charAt(i);

//			if (ch >= '0' && ch <= '9') {
//				//����
//				// '0' - '0' >> 0
//				// '1' - '0' >> 1
//				result += numCode[ ch - '0' ];
//			} else {
//				//������
//				// 'a' - 'a' >>0
//				// 'b' - 'a' >>1
//				result += abcCode[ch - 'a']; //abc�ڵ��� 0��°
//			}
//			
//			�� �����ϰԵ� �ٲ㺸��
//			
			result += ch >= '0' && ch <= '9' ? numCode[ ch - '0' ] : abcCode[ch - 'a'];
			
		}
		System.out.println("src:" + src);
		System.out.println("result:" + result);
	}
}
