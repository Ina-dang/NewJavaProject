package a220119;

public class BlockTest {//static �����۾� 
	//blockTest�� �ε�Ǹ� �����ؾ��� static ������ �ʱ�ȭ �۾��� �ϰԵ�
	static { //Ŭ���� �ʱ�ȭ
		System.out.println("static {  }");
	}
	
	//�� ���� new�� ���ؼ� �ν��Ͻ� ������ �� �ʱ�ȭ ��
	public BlockTest () {//������
		System.out.println("������}");
	} //���� ��� ������ �޶����� ������ �ʱ�ȭ ���� ������ ������ �״�
	
	{ //�ν��Ͻ� �ʱ�ȭ
		System.out.print(" {");

	}
	
	
	
	//����� �ʱ�ȭ, �ʱ�ȭ���� ���� �� �ְ� ����
	int i = 10;
	{
		i = 100;
	} //100
	
	{
		j = 100;
	}
	int j = 10; //10�� ���� ����
	
	
	public static void main(String[] args) { //�׷��� �� �ȿ� �ּ��ص� Ŭ������ �ѹ� �ʱ�ȭ ��
		System.out.println("BlockTest bt = new BlockTest(); ");
		BlockTest bt = new BlockTest(); //�ν��ϼ� ����Ȱ͵� �����۾���
		
		System.out.println("BlockTest bt2 = new BlockTest(); ");
		BlockTest bt2 = new BlockTest(); //�ν��Ͻ� ������ ������ ����
		
		System.out.println("==========================");
		System.out.println(new BlockTest().i); //100 ��
		System.out.println(new BlockTest().j); //10 ��
	}
}
