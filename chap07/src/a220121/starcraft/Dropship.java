package a220121.starcraft;

class Dropship extends Unit {

	@Override
	void move(int x, int y) { /* ������ ��ġ�� �̵� */
		System.out.println(getClass().getSimpleName() + "�� " + x + ", " + y + "��ǥ�� �̵��մϴ�");
	}
	void load() {System.out.println("���õ� ����� �¿��.");}
	void unload() {System.out.println("���õ� ����� ������.");}
}