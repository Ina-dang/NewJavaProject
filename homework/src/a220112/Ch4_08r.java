package a220112;

public class Ch4_08r {
 //������ 2x+4y=10�� ��� �ظ� ���Ͻÿ�. ��, x�� y�� �����̰� ������ ������
 // 0<=x<=10, 0<=y<=10�̴�. ����ó�� ���� ��µǰ�
	public static void main(String[] args) {
		//������ : �������� ���Ե� ��ȣ�� �ִ� ��
		for (int i = 0 ; i <= 10 ; i++) { //11������
			for (int j = 0; j <= 10 ; j++) { // 11*11 = �� 121ȸ ����
				if( 2 * i + 4 * j == 10) {
					System.out.println(i + "," + j);
				}
			}
		}
	}
}
