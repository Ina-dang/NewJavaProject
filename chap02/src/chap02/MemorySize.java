package chap02;

public class MemorySize {
	public static void main(String[] args) {
		// 1000 = 10^3 �� ����� ����
		// 1024 = 2^10 �� ��ǻ�Ͱ� �ؼ�
		
		// long Ÿ���� �ڿ� L �ٿ������
		long size = 23_617_085_440L;
		
		double humanUnit = 1000;
		double comUnit = 1024;
		
		System.out.println(size / humanUnit / humanUnit / humanUnit + "GB");
		System.out.println(size / comUnit / comUnit / comUnit + "GB");
		
	}
}
