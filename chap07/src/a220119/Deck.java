package a220119;

//Deck class ����
class Deck { //���赵���µ� CardŸ���� ���̳� �ϸ鼭 Card�� ����������������
//	final int CARD_NUM = 52;   //52��
	final int CARD_NUM = Card.NUM_MAX * Card.KIND_MAX;
	
	Card cardArr[] = new Card[CARD_NUM]; //ī��Ÿ�� cardArr�迭 ���� �ε����� 52�������

	
	Deck() {
//		int i = 0; 		
//		for (int k = Card.KIND_MAX; k > 0 ; k--) { // ī��Ŭ���� ī�庰 ������ �� k �� 0�� �ɶ����� 1�� ����
		for (int i = 0, k = Card.KIND_MAX; k > 0 ; k--) { // ī��Ŭ���� ī�庰 ������ �� k �� 0�� �ɶ����� 1�� ����
			for (int n = 0; n < Card.NUM_MAX; n++) { // 0�� ���̺� ī���� ���� ������ ������ 1������
				cardArr[i++] = new Card(k, n+1);
				// cardArr[��52�� �����迭]�� k,n+1 �����
			}
		}
	}
	//ī��Ÿ������ ��ȯ�ϴ� �ν��Ͻ� �޼���
	Card pick(int index) { // ==������
		return cardArr[index]; //cardArr[] Ư���ε��� ��ȯ
	}
	
	Card pick() {
		int index = (int)(Math.random() * CARD_NUM);
		return pick(index); //pick�� �̿뤷�ؼ� ���� ȣ��
//		return cardArr[index] �� ����
	}
	
	
	void shuffle() { //�����̱� 5-8
		for (int i = 0; i < cardArr.length; i++) {
			int r = (int)(Math.random() * CARD_NUM); 
		
		Card temp = cardArr[i];
		cardArr[i] = cardArr[r];
		cardArr[r] = temp;
		}
	}
}
//Deck Ŭ���� ��
