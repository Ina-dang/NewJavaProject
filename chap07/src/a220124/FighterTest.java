package a220124;

import java.util.stream.Collectors;

public class FighterTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if (f instanceof Unit)
			System.out.println("f�� UnitŬ������ �ڼ��Դϴ�.");
		if (f instanceof Fightable)
			System.out.println("f�� Fightable����Ŭ������ �����߽��ϴ�.");
		if (f instanceof Movable)
			System.out.println("f�� Movable�������̽��� �����߽��ϴ�.");
		if (f instanceof Attackable)
			System.out.println("f�� Attackable�������̽��� �����߽��ϴ�.");
		if (f instanceof Object)
			System.out.println("f�� ObjectŬ������ �ڼ��Դϴ�.");
		
		//�������� ���� ���� ��������
		Unit unit = new Fighter();
		unit.currentHP = 10; // �����Ϸ��� ����Ÿ������ �ν��ؼ� x,y,hp ������ ��밡��
	
		Fightable fightable = new Fighter(); 
		fightable.attack(f); //�����ν��Ͻ����. 
		Attackable attackable = new Fighter();  //attack �޼��� ȣ�Ⱑ��
		attackable.attack(f); 
		Movable movable = new Fighter(); //move �޼��� ȣ�Ⱑ��
		movable.move(1, 2);
		
		
		
	}
}
interface Fightable extends Movable, Attackable {}
interface Movable { void move(int x, int y);} //���� �ڱⰪ�� �߻�޼��带 ����������
interface Attackable { void attack(Unit u); } //���� �ڱⰪ�� �߻�޼��带 ����������

class Fighter extends Unit implements Fightable {
	public void move(int x, int y) {/* ������� */}
	public void attack(Unit u) {/* ������� */}
}

class Unit {
	int currentHP;
	int x;
	int y;
}

