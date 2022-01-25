package a220125;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//��ź�����⿡�� ��ź������ ���� ��Ȳ
//��ź�� ������ throw throws , ��ź�� �ް� catch

public class Prev { //����ó��
	public static void main(String[] args) throws IOException {
		//8���� Ű���� try, catch, finally, throw, throws
		
		//RuntimeException     : unchecked Exception ==> �����Ϸ��� ����
		//non-RuntimeException : checked Exception   ==> �����Ϸ��� üũ
		
		FileInputStream fis = new FileInputStream("text.txt"); //�������� ���� throws �� �߰�����
		//�̴�� ������ ���������µ� ���� �����غ��� ������
		//�ٵ� chap08�� text.txt����� ���� �ȶ�
		int b = 0;
		while ((b = fis.read()) != -1) {
			System.out.print(b + "::" + (char)b);
		};
		fis.close();
		System.out.println((int)'\r');
		System.out.println((int)'\n');
	}
}
