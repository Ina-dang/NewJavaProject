package a220119;

//Card Ŭ���� ����
class Card { //ī��Ŭ���� �������µ� �ٸ� Ÿ�Ծ��� �̰ź���
	//��� 6�� (ū �빮�� + _����ٿ���)
	static final int KIND_MAX = 4;   //ī�庰 ������ �� (������ �ִ밪)
	static final int NUM_MAX = 13;   //���̺� ī�� �� (ī�� �� ������ ����)

	// ���� �� ������ ��ġ ���� SPADE�� ���� ��ġ���Ƽ� 4
	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	
	//static final�� ����Ǿ��־ � ī��������� �������� �� �������� ���� (Ŭ��������)
	
	//�̰� ī�� 52���� ������ �� ������ ���� �����ϱ����� �ν��Ͻ� ���� �ʿ�
	int kind;
	int number;
	
	Card(){
		this(SPADE, 1); //ù��°�� �̰ɷ� ȣ���Ұ��� (�⺻������) Card c�� ��ī�彺���̵� �ϸ� �̰ͺ��ͳ���
	}
	//ī��Ŭ���� �������� �ؿ� ����� �ۼ��ؾ���
	Card(int kind, int number){ //ȣ����� ������ int Ÿ�� kind�� int Ÿ�� ���� �� 
		this.kind = kind; 			
		this.number = number;
	}
	
	
	//�ν��Ͻ��� Ȯ���϶�� ������ �ּҰ� ��� ��ü�� ���ڿ�
	// (����� �����Ǿ�����) public String toString���� ������ �ϰ� return ��Ʈ�� �ؾ���
	public String toString() {
//		String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"}; 
		String[] kinds = {"CLOVER", "HEART", "DIAMOND", "SPADE"}; 
//		String numbers = "0123456789XJQK"; //���� 10�� X��
		String numbers = "A23456789XJQK"; //���� 10�� X��
	
					// ���ڿ��� ��ȯ
//	return "Kind : " + kinds[this.kind] + ", number ; " + numbers.charAt(this.number);
//	return "Kind : " + kinds[kind-1] + ", number ; " + numbers.charAt(this.number-1);
	return String.format("(%s %c)", kinds[kind-1], numbers.charAt(number-1));
	} //String Ŭ���� ��
	
	
}
//Card Ŭ���� ��
