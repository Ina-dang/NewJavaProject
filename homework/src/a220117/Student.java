package a220117;

public class Student {
	//�л� ������(�ʵ�; �������)
	String stuNum;
	String name;
	int kor;
	int eng;
	int math;
	
	//�޼���
	int sum = kor + eng + math;
	float avr = (int)(sum * 100 + 0.5)/100f ; //�Ҽ��� ��°�ڸ�����

}
 //Ŭ���� �ߵǳ� Ȯ���Ϸ��� ���� ���θ޼��� ���� Ȯ���غ��� ��