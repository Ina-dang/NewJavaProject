package a220117;

public class TvTest4 {
	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3]; //���̰� 3�� Tv��ü �迭 ���� >> tv�ν��Ͻ��� �� �� �ִ� 3���� ����
		
		//Tv ��ü�� �����ؼ� Tv ��ü �迭�� �� ��ҿ� �ν��Ͻ� ���� �� ����
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv(); //�ε��� 0,1,2
			tvArr[i].channel = i+10; // tvArr[i]�� channel�� i+10�� ����
								//10, 11, 12 ������ �� �� �ʱ�ȭ
		}
		
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i].channelUp(); //tvArr[i]�� �޼��带 ȣ��. ä���� 1����
			System.out.printf("tvArr[%d].channel=%d%n", i, tvArr[i].channel);
		}
		
		for(Tv t : tvArr) {
			System.out.printf("tvArr.channel : %d%n", t.channel);
		}
		String str = "abcde";
		System.out.println(str.substring(2, 4)); //3`������ 4������
		//cde ���
		
		
		
	}
}
// �Ʒ� class Tv �� �����ִµ� �̹� ���� ������Ʈ�� class Tv�� �־ ������

