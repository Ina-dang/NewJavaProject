package chap02;

public class VarEx2 {
	// �� ������ ���� ��ȯ�ϰ� ���� �� tmp ��� �ӽ���������� ������ֱ�
		/*
		 * ���� ������ �� ��ȯ�ؾ� �ϴ� ��� �߻�
		 */
		public static void main(String[] args) {
			int x = 10, y = 20; 
			int tmp = 0;
			
			System.out.println("x:"+ x + " y:" + y);
			tmp = x;
			x = y;
			y = tmp;
			
			System.out.println("x:" + x + " y:" + y);
			
			int tmp1 = 0;
			tmp = x + 130;
			x = y + 130;
			y = tmp1 + 130;
			
			System.out.println("tmp:" + tmp + " x:" + x + " :y" + y );
			
			/*
			 * ���� ����Ģ
			 * 1. ��ҹ��� ����
			 * 2. ����� ���Ұ�
			 * 3. ���ڷ� ���� �Ұ�
			 * 4. Ư�����ڴ� _, $�� ���
			 * 		 */
			
			/*
			 * ���α׷� ��Ģ
			 * 1. Ŭ���� �̸��� ù ���ڴ� �׻� �빮�ڷ�
			 * 	  - ������ �޼����� �̸��� ù ���ڴ� �׻� �ҹ��� 
			 *    - �ҹ��ڷ� ������� F2������ ���� �Ǵ� / Class ��Ŭ�� - Refactor - Rename
			 * 2. ���� �ܾ�� �̷���� �̸��� �ܾ��� ù ���ڸ� �빮�ڷ�
			 * 	  - lastIndexOf, StringBuffer 
			 * 3. ����� �̸��� ��� �빮��, �����ܾ��ϰ�� _�� ����
			 *    - Pl, MAX_NUMBER
			 */

			System.out.println(Math.PI - 3);
			System.out.println(Integer.MAX_VALUE);
			
			// �Ϲ����� ǥ�� > ī��ǥ���(camelCase) : lastIndexOf -> Ȥ�� �ִ°�ó�� �߰� �߰� �빮�� 
			//				   �Ľ�Į ǥ��� : Total Number ->'C#�� ù���ڵ� �빮��'
			// ��� > ������ũ(Snake_Case)ǥ��� : �ܾ� ���̿� ����� 
			
			int ���� = 30; //�����ڵ尡 �����ؼ� �ѱ�, ���� �� ���������� ���� ������ -> �νĺҰ��Ҽ���
			
			System.out.println(����);
			
			// ���� �ؿ� �� �����̸� �����ְ� '�ǹ��ִ� �̸�'���� �ϱ� -> ������ ŷ�޴´��Ͻ�
			
			int curPos = 0; // ������ġ(current position)
			int lastPos = -1; // ��������ġ(last position)
			
			System.out.println(curPos);
			System.out.println(lastPos);					
		}
}
