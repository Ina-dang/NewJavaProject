package a220121.starcraft;

class Marine extends Unit {

	@Override
	void move(int x, int y) { /* ������ ��ġ�� �̵� */
		System.out.println(getClass().getSimpleName() + "�� " + x + ", " + y + "��ǥ�� �̵��մϴ�");
	}
//	void stimPack() { /* �������� ����Ѵ� */ }
	void stimPack() {
		System.out.println("������ ���");
	}
} 