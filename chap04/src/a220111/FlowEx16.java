package a220111;

/*
 * �ﰢ�� �� ������
 * *
 * **
 * ***
 * **
 * *
 */
public class FlowEx16 {
	public static void main(String[] args) {
		for(int i= 0; i < 5; i++) {
			for(int j= 0; j < 5; j++) {
						//���⸦ �����ϴ°� �������� ����
				boolean b = i == j ; //if���� boolean���� ������ ���߿� �ٲٱ� ����
				if(b) {
					//���⿡ �ϳ� �� if�� ����־��ش�
//					System.out.print("*");
					System.out.printf("[%d,%d]", i, j);
				} else {
//					System.out.print("");
				}
			}
			System.out.println();
			
			
			//5*5������ ������ ���� 
			/*
			 *      *
			 *     ***
			 *    *****
			 *     ***
			 *      *
			 */
			
// Ƽ���� ��ġ 2���� ��ǥ���� ����
// �̰� ���Ģ���� ���� � �ݺ��������ϸ� ��� ��ġ�Ǵ���
// �� �˱����� �ʿ��� ������ �� ������
		}
	}
}
