package a220106;

public class OperatorEx22 {
	public static void main(String[] args) {
		float  f  = .1f;
		double d  = .1;
		double d2 = (double)f;
		double d3 = .1f;
		
		
		System.out.printf("10.0==10.0f %b%n", 10.0==10.0f);
		System.out.printf("0.1==0.1f %b%n", .1==.1f);
		System.out.printf("f  = %19.17f%n", f); //19.17 == 19�ڸ� ����ϰ� 17��°�ڸ����� �Ҽ���
		System.out.printf("d  = %19.17f%n", d);
		System.out.printf("d2 = %19.17f%n", d2);
		System.out.printf("d3 = %19.17f%n", d3);
		System.out.printf("d==f  %b%n", d==f);
		System.out.printf("d==d2 %b%n", d==d2);
		System.out.printf("d2==f %b%n", d2==f);
		System.out.printf("(float)d==f %b%n", (float)d==f);
		
		// ���� Ŭ���� ������µ� ����Ȯ����� .java
		
		
		
	}
}
