package a220121.starcraft;

abstract public class Unit {
	int x, y;
	
	abstract void move(int x, int y); //���� �����ڸ��� ������ ������
//	void stop() {/*���� ��ġ�� ����*/}	
	void stop() {System.out.println(getClass().getSimpleName() + "����");
	}
	
}


