package a220111;

public class FlowEx14 {
	public static void main(String[] args) {
		for (int i = 1, j = 10; i <=10; i++, j--)  { //2���� ��ø�ݺ���
			System.out.printf("%d \t %d%n", i, j);
		}
		//�������������ƴ� : ���� �������ϸ� ������ ������
		System.out.println("==================");

		//�׷��� �Ʒ�ó�� ����
		for (int i = 1 ; i <= 10; i++) {
			System.out.printf("%d \t %d%n", i, 11-i);
		}
		for (int i = 1 ; i < 10; i++) { //�̸����� �Ѵٸ�
			System.out.printf("%d \t %d%n", i, 10-i);
			//���峻���� ������ ��� x. ������������
		}
	}
}
