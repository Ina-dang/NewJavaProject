package a220111;

public class HwResult1 { //������ �ι�° �ؼ�
	public static void main(String[] args) {
//		int r1 = (int)(Math.random() * 2); // 0,1 
		// �� ����� �������
		
		for (int i = 0 ; i < 4 ; i++ ) {
		//�� �� 4���� ����°� ��4���� �����ϰ� ���ε��� 
		int r1 = (int)(Math.random() * 2); // 0,1 
		int r2 = (int)(Math.random() * 2); // 0,3�ϰ������ ������ �� * 3 
		int r3 = (int)(Math.random() * 2); // 0,5 
		int r4 = (int)(Math.random() * 2); // 0,7
								  //������ �� ����
										 //�賻�� ���ϴ� ������ �� ����
		
//		int r5 = (int)(Math.random() * 2) *7 +2 ; // 2,9 > ���� �� ã�� >> 0,7 
										//0, 1 > 0, 7 > 2, 9
		
		
		//��� ���ϸ� ������ 0 �ִ밪 4
		//0 �� 
		switch (r1+r2+r3+r4) {
		case 0:
			System.out.println("��");
			break;
		case 1:
			System.out.println("��");
			break;
		case 2:
			System.out.println("��");
			break;
		case 3:
			System.out.println("��");
			break;
		case 4:
			System.out.println("��");
			break;
		default:
			break;
			}
		}
	}
}
