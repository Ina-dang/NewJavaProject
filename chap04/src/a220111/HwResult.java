package a220111;

public class HwResult {//220110������ ���� ���ؼ�
	public static void main(String[] args) {
		// ������ ����� �� 16
		// how come? 4������Ⱑ �������� ���������� 2^4 = 16
		// 0000 ~ 1111
		for(int i = 0 ; i < 20 ; i++) {
		//�̷����ؼ� �ݺ��� ���� ��ȣ�� �־��൵��
			int result = (int)(Math.random() * 16); // 0~15�� 1���� 16�ƴ�!!
		// 0�� ����ص� �� Ȯ�� ��� �ϼ�
		switch (result) {
		case 0:
			System.out.println("'��'�Դϴ�");
			break;
		case 1:
			System.out.println("'��'�Դϴ�");
			break;
		case 2: case 3: case 4: case 5:
			System.out.println("'��'�Դϴ�"); 
			// Ȯ���� �߰��ϴ°� �ƴ� ����������� �� 4���߿� 1���� ���� ���� ������
			break;							  
		case 6: case 7: case 8: case 9:
			System.out.println("'��'�Դϴ�");
			break;
		default:
			System.out.println("'��'�Դϴ�");
			break;
			}
		}
	}
}
