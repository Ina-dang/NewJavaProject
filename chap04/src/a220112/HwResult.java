package a220112;

public class HwResult { // 20�ڸ��� ���빮��, ������ ������ �ϰ� �ִ� ���ڿ� ����
	public static void main(String[] args) {
	/*
	 * ���빮�� 26��
	 * ���� 10��
	 * �� 36 >> 0~35 ������ �߿� �ϳ��� ��
	 * 0����9������ �����ϸ�ǰ�
	 * 10���ʹ� ���ڿ�������
	 * 
	 * result + 55�ϸ� 10+55�ϴϱ� 65
	 */
		//��� 1
//		int result = (int)(Math.random() * 36);
//		
//		System.out.println(result < 10? result : (char)(result + 55));
////							0,1,2,3,4,5,6,7,8,9
										
		
		//���2
		String str = "";
		for(int i = 0; i < 20; ++i) {
			//26 ���빮�� ����, 26 ���ҹ��� ����, 10 ���ڹ���
			int result = (int)(Math.random() * (26 + 26 + 10));
			
				//��������
				if(result <10) {
					str += result;
				}
				//���ҹ�������
				else if (result > 36){
					str += (char)(result + 61);
				}
				//���빮������
				else {
					str += (char)(result + 55);
				}
				// - ������ �߰�
				if (i % 5 == 4 && i != 19) {
					str += "-";
				}
		}System.out.println(str);
	}
}
