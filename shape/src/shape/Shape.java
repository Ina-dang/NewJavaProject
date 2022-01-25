package shape;

abstract public class Shape {
		private int i; //�ƹ��ų��ص� ������� ���⿡ ���������� ���ϰ��� �ڵ尡 ���Ϸ� �� ������ǵ� �������
		
//		public Shape() {} //�̰žȸ����� ��� �⺻������ �ʼ�����ߴµ�
		
		public Shape(int i) { //i�� �����ϴ� �⺻�����ڿ� �߰������� �� �ִ� ���·� �غ����� �׷� ���� Ŭ�������� ������� �����ؾ��ϴ°�
			super();
			this.i = i;
		}

		protected int getI() { //��� �پ��� �¾��� �ۺ� ���ϴ°����� i��� �̸��� ��ٴ°Ŵϱ� ����Ƚ�Ű���� �����ϱ� ������Ƽ�� �ϴ°�����
			return i;
		}

		protected void setI(int i) {
			this.i = i;
		}

		//���� ���̰�
		abstract public double getArea(); //�ٿ������ �߻�޼��� ���� => ���̰�
	
}
