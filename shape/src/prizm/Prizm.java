package prizm;

import shape.Shape;
import shape.D3;
import tri.Tri;

public class Prizm extends Shape implements D3 {
	private Tri tri; //�ʱ⿡ ��Ʈ���̾ޱ� �ȵ� �����Ҷ� ����

	public Prizm(int x, int y, int z) {
		super(z);
		tri = new Tri(x, y);
	}
	
	// ������̶� ���İ��Ƽ� ���߿��� �� tri�� �����Ϸ��� �Ұ���
	@Override
	public double getVolume() {
		return tri.getArea() * getI();
	}

	@Override
	public double getArea() {
		return tri.getArea() * 2 + tri.getCircum() * getI();
	}	
	
}
