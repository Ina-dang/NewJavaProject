package a220113;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class NicknameMaker {   
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    StringBuffer buffer = new StringBuffer();
    
    Random random = new Random();

    //������ �޾ƿ���
    System.out.print("��� �ִ� �������� �Է��ϼ���. ��");
    String inputD;
    inputD = scanner.nextLine();

    String[] nick1 = { "����", "�����", "�ɰ���", "������", "��û��", "��������", "��������", "�����", "�����", "�ɽ���" };// ���� ���ľ� �迭

    // ���ľ� �������� �����ϱ�
    List<String> nick1S = Arrays.asList(nick1);
    int i = (int) (Math.random() * nick1.length); // ���� ����
    nick1S.get(i).toString();

    String[] nick2 = { "��", "�����", "�ڹ���", "�󷹹���", "�̰Ŵ�", "������", "�����", "���ι�", "�ô�����", "����", "�Ҽ�", "í��", "��»����", "�ٺ�",
            "�ٰ߹�", "����", "��", "���ϴ� ����", "������"};// ���� �迭

    // ���� �������� �����ϱ�
    List<String> nick2S = Arrays.asList(nick2);
    int k = (int) (Math.random() * nick2.length);
    nick2S.get(k).toString();

    System.out.print("���� : " + inputD + "�� " + nick1S.get(i).toString() + " " + nick2S.get(k).toString());

	}
}

