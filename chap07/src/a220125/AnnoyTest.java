package a220125;

//�������� ������ġ : �޼��� ��
//����Ŭ���� : �޼��� �� . ������������ �ʴ��̻� �ܺο��� ���ٺҰ�
public class AnnoyTest {
	public static void main(String[] args) {
		Runnable runnable1 = getRunnable(); 
		runnable1.run();
		runnable.run();
		Runnable runnable2 = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
			}
		};
		
	}	
	static Runnable getRunnable() {
		//�������ؼ� �� �ȿ��� ����Ŭ���� ������
		class RunnableImpl implements Runnable { //�ν��Ͻ� �����Ϸ��� ������ ����Ŭ���� ã�ƾ��ϴϱ� ����Ŭ�������� ã�ƿ�
			@Override
			public void run() {
			System.out.println("getRunnable().run()");
			}
		}
		return new RunnableImpl(); //�׸��� �� �ν��Ͻ� ����
	}
	
	//�͸�Ŭ����
	static Runnable runnable = new Runnable() {
		@Override 
		public void run() {	
			System.out.println("runnble.run()");
		}
	}; //new������ ���弱�̶� �����ݷ����� �� �ݾƾ��� (�����Ұ�)
}

interface Runnable {
	void run();
}
