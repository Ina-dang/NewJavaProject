package a220121.starcraft;

public class AbstractTest {
	public static void main(String[] args) {
		
//		Unit u = new Unit();
		//�߻�Ŭ������ �߻�޼��嶧���� �ν��Ͻ�ȭ �ȵǰ� ��������ϸ� �����ŷο�
		//�׷��� �����Ǿ��ִ� �ڼ����� �����ϴ°� �� ����
		Unit u1 = new Marine();
		Unit u2 = new Tank();
		
		Unit[] group = new Unit[4];
		group[0] = new Marine();
		group[1] = new Tank();
		group[2] = new Marine();
		group[3] = new Dropship();
		
		for(Unit u : group ) {
//			if (u instanceof Tank) { //���� ��������� �̷����ؾ���
//				((Tank)u).move(10, 20);
//			} 
//			else if(u instanceof Marine) {
//				((Marine)u).move(10, 20);
//			}
			u.move(10, 20); // ���� �����־ �׳� �̷��� �ϸ��
		} //�̰� �� ������
		
		
		//�������ε�(Dynamic Binding)
		//��������� ���� �ڼ� Ŭ���� �ߺ� ���ǵȰ�� �� Ŭ������ ����� ������� ���
		//�ν��Ͻ� �޼���� �ߺ����� �� ���(�������̵�) ���� �ν��Ͻ��� ���(�޼���)�� ȣ��
		
//		
//		for (int i = 0; i < group.length; i++) {
//			group[i].move(100, 200);
//		}
	}
}

