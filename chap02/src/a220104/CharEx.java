package a220104;

public class CharEx {
	public static void main(String[] args) {
		char ch = 'A'; 		//char ch = 65;
		int code = (int)ch; //ch�� ����� ���� int Ÿ������ ��ȯ�Ͽ� �����Ѵ�.
		
		System.out.printf("%c=%d(%#X) %n", ch, code, code);
							// char=10��(#16����), ����
		char hch = '�R'; 	// char hch = 0xAc00;
		System.out.printf("%c=%d(%#X) %n", hch, (int)hch, (int)hch) ;
		
		//char �� ũ�� 2byte
		// 2^16 = 65536 �� 0~65535
		
		//escape char Ư�� 
		
		/* ������ �̿� tab�̳� backspace ���� Ư�����ڸ� �����ϴ� ���
		 * 
		 *  ex) tab
		 * 		char tab = '\t'; // ���� tab�� �� ���ڸ� ����
		 * 		
		 * 		tab = \t
		 * 		backspace = \b
		 * 		form feed = \f
		 * 		new line = \n
		 * 		carriage return = \r
		 * 		�������� = \\
		 * 		��������ǥ = \'
		 * 		ū����ǥ = \"
		 * 		�����ڵ�(16����)���� = \ u + �����ڵ� (��: char a='\u0041')
		 * 		
		 */
		System.out.println("\"����ǥ���\"");
		System.out.println('\"');
		System.out.println("��\t��\t��\t"); //\t ������[    ]�̷��� ���� �ؾ���
		System.out.println('\u0041');
		System.out.println("\t��\r��\n��\f\f\f\f\f\f\fAAB");
		
		char ch1 = 'A';
		short s = 65;
		
		System.out.println(ch1);
		System.out.println(s);
		
		// ��ǻ�ʹ� �Ѵ� 2���� 65�� �޾Ƶ������� ��°���� �ٸ���
		// ��ǻ�ʹ� ���ڹۿ� �𸣱⶧����.. (������ �����ڵ�)
		
		/*		���ڵ� : �츮�� ���°� ��ǻ�Ͱ� �����ϵ��� �ڵ�ȭ ��Ŵ 
		 * 'A' ---------> 65
		 *     <---------
		 *      ���ڵ� : ��ǻ�Ͱ� �����Ѱ� �ٽ� �츮������ ��ȣȭ(��ȣȭ) ��Ŵ
		 *      
		 * codec : coder + decode �� �ռ��� 
		 * modem : modulator + demodulator �� �ռ���
		 * 
		 */		
	}
}
