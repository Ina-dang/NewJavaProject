package a220111;

public class Ch4_05 {//������ for ���� while������ �����Ͻÿ�
	public static void main(String[] args) {
//		for(int i=0; i<=10; i++) {
//			for(int j=0; j<=i; j++)
//				System.out.print("*");
//			System.out.println();
//		}
		// for ���� 
		// 1 �ʱ�� 2���ǽ� 3 ���� 4������ �״����� �ٽ� 2���ǽ� . . . 
		
		int i = 0;
		while (i <= 10 ) {
			int j = 0;
			while (j <= i){
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++; 
		}
	}
}
