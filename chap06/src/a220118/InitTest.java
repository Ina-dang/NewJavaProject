package a220118;

public class InitTest {
	public static void main(String[] args) { 
		
//		System.out.println(Init.si);
//		System.out.println(Init.si);

//		Init init = new Init(); //�ν��Ͻ�����
//		//�ν��Ͻ��� ����� = ��ü = ��ü���赵�� Ŭ���� ==> �� ��ü�� ������� ���赵�� �־����. �ʱ�ȭ ��ġ�Ե�
//		System.out.println(init.i);
		
		new Init();
		new Init();
//		new Init();
		Init init = new Init(); //�ν��Ͻ�����

//		System.out.println(Init.si); //�� �ѹ� �ʱ�ȭ�� ������ 1�� ����
		

			
	}
}

class Init {
static int cnt = 1; //�޼���
static int count() {
	System.out.println("count().cnt :: " + cnt);
	return cnt++;
}

static int si = count(); //ī��Ʈ ���� �� //s�� InitTestŬ������ ���

int i = count();
}
