package a220112;

public class MiniHomework {
	
	// 8, 9, 10, 11, 13, 15
	// ��κ� �ڵ尡 �ϼ��Ǿ������� �� �ؼ��ϸ鼭 ��ĭ ������� �����غ���
	
	// prime number (�Ҽ�) : 1���� ū ������ �ڿ������ �θ�. �ڿ��� �� ����� 1�� �ڱ��ڽ��� ����
	
	// ������ 1�ϸ�ǳ�? ���̵��� �ִٰ� �Ͻ�
	// �Ҽ� ���� �����غ���
	
	// �Ҽ� : ����� ������ 2���� �� >> ��Ʈ��
	// 1�� ��� 1     --> �̰� prime number �ƴ�!
	// 2�� ��� 1, 2
	// 3�� ��� 1, 3
	// 4�� ��� 1, 2, 4
	// 5�� ��� 1, 5
	// 6�� ��� 1, 2, 3, 6
	// 7�� ��� 1, 7
	
	// 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 . . . 
	
	// �Ҽ� �� ���� ���ں��� 30�� ���
	public static void main(String[] args) {
		//���� ������ ��������? �� ���� ���� ���� �����Ҷ����� 
		for(int i = 2; i < 30; i++) { //����
			for(int j = 2 ; j < i; j++) { //���󰡴� ������ �� 
				if( i % j == 0 && i != j) {
				// ����� 1�� �ڱ��ڽ��� ����
				// ���� : 1�� �ڱ��ڽſܿ� ����� �� �ִ� ����
				// 1�� �Ҽ� �ƴ�
					System.out.printf("%d�� �Ҽ��� �ƴմϴ�%n", i);
					break;
				}
			}

		}
	}
}