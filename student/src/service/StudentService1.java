package service;

import static utils.StudentUtil.*;
import static domain.Student.*;
import app.StudentEx;
import domain.Student;

public class StudentService1 {
	
	//�л�������
	Student[] students = new Student[10];

	
	int cnt; //���� �л� �ο���
	
	String[] names = {"��溸", "�赿��", "�����", "�����", "�迹��", "��ġ��", "������"};
	
	
	public StudentService1() { //��Ʃ��Ʈ���� ������
		for (int i = 0; i < names.length; i++) {
			students[cnt] = new Student(220000 + cnt + 1 + "", names[cnt], getScore(), getScore(), getScore());
			cnt++;
		}
	}
	
	int getScore() {
		return (int)(Math.random()*41)+60;
	}
	
	//��ȸ
	void list() {
		System.out.println("�й�\t  �̸�\t  ����\t ����\t ����\t ����\t ���");
		System.out.println("======================================================");
		for (int i = 0; i < cnt; i++) {
				System.out.println(students[i]); // �� �ּҰ��� toString�� ����� ���ڿ��� ��ȯ
		}


	}
	
	//���
	void register() { 
		
		students[cnt++] = new Student(nextLine("�й�>"), nextLine("�̸�"), nextInt("����"), 
				nextInt("����"), nextInt("����") );

	}
	//��Ϻκ� ��
	Student student = new Student();
	
	//����
	public void modify() { 
		//�й����� �л��� Ž�� �� �л� ������ �� �̸� , ���� ����
		String no = nextLine("������ �л��� �й� >> "); 
		for (int i = 0; i < cnt; i++) {
			if (students[i].getNo().equals(no)) { //equals Ȯ��
				System.out.println(students[i]);
				String name = nextLine("�̸�>");
				int kor = nextInt("����>");
				int eng = nextInt("����>");
				int math = nextInt("����>");

				students[i].setName(name);
				students[i].setKor(kor);
				students[i].setEng(eng);
				students[i].setMath(math);
			}
		}
	}//modify ��
	
	//����
	boolean flag = false;
	
	public void delete() {
		String no = nextLine("������ �л��� �й� >>"); 
		for (int i = 0; i < cnt; i++) {
			if (students[i].getNo().equals(no)) { //equals Ȯ��
				System.out.println(this.names + "�� �����մϴ�");
				for (int j = 0; j < cnt-1; j++) {
					students[j] = students[j+1]; 
				}
				cnt--;
				flag = true;
				break;
			}
		}
	
	}
}
