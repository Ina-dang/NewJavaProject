package a220110;

public class Switch {
/*
 * switch ����
 * 1. ����񱳿����ڸ� ���� (==)
 * 
 * �������� ���� �� �ϴ°� �� ����
 * ����ġ�� ��ø������
 * 
 * switch ����
 * 1. ���ǽ��� ����Ѵ�
 * 2. ���ǽ��� ����� ��ġ�ϴ� case������ �̵��Ѵ�
 * 3. ������ ������� �����Ѵ�
 * 4. break���̳� switch���� ���� ������ switch�� ��ü�� ����������
 */
	public static void main(String[] args) {
		int val = 1;
		switch (val) { //key���� ����
		case 1:    //value���� ���� ��
			System.out.println("case 1");
			break;
		case 2:    
			System.out.println("case 2");
			break; //break ������ ��� ����
		case 3:    
			System.out.println("case 3");
			break;
		default:  //default ������ ���� �� ��½� �ƹ��͵� �ȶ�
			System.out.println("case 4");
			break;
		}
		
		int grant = 1;
		switch (grant) {
		case 7:
			System.out.println("�ۼ� ���� ���");
			break;
		case 5:
			System.out.println("���� ���� ���");
			break;
		case 4:
			System.out.println("�б� ���� ���");
			break;
		default:
			System.out.println("���� ����");
			break;
		}
	}
}
