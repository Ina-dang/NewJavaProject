package a220110;

public class IterationWhile { //�ݺ��� Loop 
	/*
	 * for, while���� ���� ������ ���ǿ� ���� �ѹ��� ������� ���� �� �ִ�.
	 * do-while : switch���� �Ⱦ�. �̰� ������ �ּ��� �� ���� ����� ���� �����
	 * 
	 * ���ǹ� : ���ǿ� �����ϸ� �� ���� ��
	 * �ݺ��� : ���ǿ� �����ϸ� �����
	 */
	
	/*
	 * for : �ݺ� Ƚ��(�Ⱓ)�� �˰����� �� ���
	 * while : ������ �����ϴ�. if���� ������ ������ while�� ���ǽ��� ������ �� ������ �ݺ�
	 */
//	
	public static void main(String[] args) {
//		//�ݺ��� ���ǻ���
//		//infinity loop
//		while(true) {
//			System.out.println("�ȳ��ϼ���");
//			break;
//		}
//		//������ü�� Ż���� �� �ְ��ϰų� break ���ش�
//		System.out.println("����");
		
		int i = 0;
		while(i < 3) { //�̷������� true ���� ��ü�� Ƚ�� ������ �ɾ��ָ��
			System.out.println("�ȳ��ϼ���");
			i++;
		}
		System.out.println(i);
	
//		while ���ǻ���
//		Ż�ⱸ�� Ȯ���ϰ� �����
	}
}
