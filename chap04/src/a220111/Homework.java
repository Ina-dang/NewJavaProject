package a220111;

public class Homework {
// ��ǰID�� ������ �̾Ƴ���
//	�� 20�ڸ�. 15�ڸ��� ���ڿ� 5�ڸ��� ���ĺ� ����
	public static void main(String[] args) {
	
	for(int i = 0; i<15; i++) {
		int num  = (int)(Math.random() *  9    );
										//������ �� ����
											//�賻�� ���ϴ� ������ �� ����
	
		switch (num) {
			case 0:
				System.out.print('0');
				break;
			case 1:
				System.out.print('1');
				break;
			case 2:
				System.out.print('2');
				break;
			case 3:
				System.out.print('3');
				break;
			case 4:
				System.out.print('4');
				break;
			case 5:
				System.out.print('5');
				break;
			case 6:
				System.out.print('6');
				break;
			case 7:
				System.out.print('7');
				break;
			case 8:
				System.out.print('8');
				break;
			case 9:
				System.out.print('9');
				break;
			default:
				break;
			}//���� �̰� ���ĺ��� �����ϳ�
		}
	int num1 = (int)(Math.random() *  26);
		//A-Z 65-90 ���� 1�� ��� �� �ְ� �����Ѵ�
		char ch = 90;
		System.out.print(ch);
		//�� ���� 65++1�ϸ� �ɰͰ�ư��..
		switch (num1) {
		case 1:
			System.out.println('A');
			break;

		default:
			break;
		}
		
		//charAt? 
		//�ֻ��� �����غ��ھ�
	}
}
