package a220117;

public class CardTest { //Ch6 CardTest �������� Card ���� Ŭ���� ���� �и���
	
	public static void main(String[] args) { //�Է°�
		
		System.out.println("Card.width = " + Card.width); // ������ CardŬ�������� �ʱ�ȭ �� ���� ���
		System.out.println("Card.height = " + Card.height);
						// Ŭ��������(static)�¡� ��ü���� ���� 'Ŭ�����̸�.Ŭ��������'�� ���� ��밡��
		
		Card c1 = new Card();
		c1.kind = "Heart"; //Card Ŭ������ �ν��Ͻ�
		c1.number = 7;     //Card Ŭ������ �ν��Ͻ� (���� ���� ����)
		
		Card c2 = new Card();
		c2.kind = "Spade"; //�ν��Ͻ� ������ ���� �����Ѵ�.
		c2.number = 4;
		
		System.out.printf("c1�� %s, %d�̰� ũ���(%d, %d)%n", c1.kind, c1.number, Card.width, Card.height);
		System.out.printf("c1�� %s, %d�̰� ũ���(%d, %d)%n", c2.kind, c2.number, Card.width, Card.height);
		
		System.out.println("c1�� width�� hight�� ���� 50, 80 ���� �����մϴ�");
		c1.width = 50; //Ŭ���� ������ ���� �����Ѵ�
		c1.height = 80;
		
		System.out.printf("c1�� %s, %d�̰� ũ���(%d, %d)%n", c1.kind, c1.number, Card.width, Card.height);
		System.out.printf("c1�� %s, %d�̰� ũ���(%d, %d)%n", c2.kind, c2.number, Card.width, Card.height);
		
	}
}
