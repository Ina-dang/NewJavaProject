package a220117;

public class student {
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
