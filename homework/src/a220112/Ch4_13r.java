package a220112;

public class Ch4_13r {
	// CharAt�� ����� ���ڿ��� ���������ƴ����Ǵ� 
	// o�� �ҹ���o��
	public static void main(String[] args) {
		{
			String value = "12o34";
			char ch = ' ';
			boolean isNumber = true; //�Ҽ��� ��� flag�� ���ٰ� �����ϸ�ȴ�
			
			// �ݺ����� charAt(int i)�� �̿��ؼ� ���ڿ��� ���ڸ� �ϳ��� �о �˻�
			for ( int i= 0; i<value.length() ;i++) {
				// �ڵ�
				if (!(ch >= '0' && ch<='9')) {
				ch = value.charAt(i); //�ܾʵ�
				break;
				}
			}
			if (!isNumber) {
				System.out.println(value +"�� �����Դϴ�" );
			} else {
				System.out.println(value + "�� ���ڰ� �ƴմϴ�");
			}
		}//��� 12o34�� ���ڰ� �ƴմϴ�
	}
}
