package a220119;

import java.util.Arrays;

//��� Ŭ����
public class DeckTest { //�̰��������� ���赵Ȯ��
	public static void main(String[] args) {
		Deck d = new Deck(); 		//ī�� Deck Ÿ���� ���� d �ν��Ͻ� ��ü ����
		System.out.println(Arrays.toString(d.cardArr));
//		d.shuffle();				//�̰� ������ ��Ʒ��� ���� �� �ƴϰ� �ѹ� ���� ���� ���� ī�� ������
		Card c = d.pick(0);  		//�������� ���� �� ī�� �����Ѵ� (0���� 51������ 52��ī�� ����)
		System.out.println(c);		//System.out.println(c.toString());�̶� ����
		System.out.println();
		
		d.shuffle();				//����
		System.out.println(Arrays.toString(d.cardArr));
		c = d.pick(0);				//pick
		System.out.println(c);		//System.out.println(c.toString());�̶� ����
		System.out.println();
		
		System.out.println(Arrays.toString(d.cardArr));
		c = d.pick();
		System.out.println(c);		//System.out.println(c.toString());�̶� ����
	}
	//CardŸ�� c ������ ���� �ּҰ����;��ϴµ� Card class�� �ִ� toString ������ �ּҴ�� ������ 
}
