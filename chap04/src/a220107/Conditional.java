package a220107;

public class Conditional { //���ǹ�
	public static void main(String[] args) {
		/*
		 * ���(control statement) : pg�� �帧(flow)�� �ٲٴ� ������ �ϴ� �����
		 *  
		 * - ���ǹ�(conditional statement) = if, switch
		 * {} ���̶� �θ� . �ְǽ��� �������� ���� ������ ������ �޶����� pg�� flow�� ���� ����
		 * �ַ� if ���̻�� 
		 * ó�� ���� �������� switch�� �� ������ ������ ����
		 * 
		 * - if�� ���϶��� �����ϴ°� if
		 * [if�� �������]
		 * if(���ǽ�) {
		 * 		����(���ǽ��� true�� �� ����� ������� ���´�)
		 * }
		 * 
		 */
		int score = 0;
		if  (score >= 60) {
			System.out.println("�հ��Դϴ�");
			System.out.println("�����մϴ�");
		} 
		else {
			System.out.println("���հ��Դϴ�");
			System.out.println("���� ��ȸ�� �����ϼ���");
		}
	}
}
