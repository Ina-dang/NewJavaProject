package a220114;

public class Ex06MaxMin { //�ִ밪�� �ּҰ� ���ϱ�
	public static void main(String[] args) {
		int[] score = { 79, 88, 91, 33, 100, 55, 95};
		
		int max = score[0] ; //�迭�� ù ��° ������ �ִ밪�� �ʱ�ȭ �Ѵ�.
		int min = score[0] ; //�迭�� ù ��° ������ �ּҰ��� �ʱ�ȭ �Ѵ�.
		
//		System.out.println(score[0]); // 79
		
		// ������ ���� �� ���� ���� �ϳ� �ϳ��� ���ؼ� �� ���� ũ�� ���Ƴ���
		for (int i = 1; i < score.length; i++) { // 0���� score.length���� 1������ 
			// ������ġ�� 1�̶� 6��. 0�����ϸ� 79�� 79�񱳶� �ε���1�� 88���� 78�� 88�񱳸� ��
			if (score[i] > max) { // score�ε����� score[0]���� ũ��
				max = score[i];   // i�ε��� �ִ밪�� max�� ��ü
//				[0]79 < [1]88 => 88�� ����
//				[1]88 < [2]91 => 91�� ����
//				[2]91 > [3]33 => else if�� ����
				
			} else if(score[i] < min) { //score �� score[0]������ ������
				min = score[i];			//i�ε��� ���� min�� ��ü
//				[0]79 > [3]33 => min [3]33���� ����
			}
			//�̷������� [7]���� ��ü
		}
		
		System.out.println("�ִ밪 :" + max);
		System.out.println("�ּҰ� :" + min);
	}
}
