package a220112;

public class Ch4_13 {
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
				ch = value.charAt(i);
				isNumber = false;
				System.out.println(ch);
				break;
			}
			if (isNumber) {
				System.out.println(value +"�� �����Դϴ�" );
			} else {
				System.out.println(value + "�� ���ڰ� �ƴմϴ�");
			}
		}//��� 12o34�� ���ڰ� �ƴմϴ�
	}
}