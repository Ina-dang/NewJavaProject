package a220121.starcraft;

class Tank extends Unit {

	@Override
	void move(int x, int y) { /* ������ ��ġ�� �̵� */
		System.out.println(getClass().getSimpleName() + "�� " + x + ", " + y + "��ǥ�� �̵��մϴ�");
	}

	void stimPack() {System.out.println("���ݸ�带 ��ȯ�Ѵ�");}
} 