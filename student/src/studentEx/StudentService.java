package studentEx;


class StudentService {
	
	//�л�������
	Student1[] students = new Student1[10];

	
	int cnt; //���� �л� �ο���
	
	String[] names = {"��溸", "�赿��", "�����", "�����", "�迹��", "��ġ��", "������"};
	
	
	public StudentService() { //��Ʃ��Ʈ���� ������
		for (int i = 0; i < names.length; i++) {
			students[cnt] = new Student1(220000 + cnt + 1 + "", names[cnt], getScore(), getScore(), getScore());
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
			if(students[i] != null) {
				//�����
				System.out.println(students[i]); // �� �ּҰ��� toString�� ����� ���ڿ��� ��ȯ
			}
		}


	}
	
	//���
	void register() { //StudentEx���� scanner static ��
		System.out.print("�й�>");
		String no = StudentEx.scanner.nextLine();
		System.out.print("�̸�>");
		String name = StudentEx.scanner.nextLine();
		System.out.print("����>");
		int kor = Integer.parseInt(StudentEx.scanner.nextLine());
		System.out.print("����>");
		int eng = Integer.parseInt(StudentEx.scanner.nextLine());
		System.out.print("����>");
		int math = Integer.parseInt(StudentEx.scanner.nextLine());
		
		Student1 student = new Student1(no, name, kor, eng, math);
		
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				break;
			}			
		}
	}
	
	//�й��� �Է��ϰ� �л��� ã�� ������ �������� ���Ŀ� ����
	
	//����
	void modify() {
		//�й����� �л��� Ž�� �� �л� ������ �� �̸� , ���� ����
		//�����
		System.out.print("������ ������ �л��� �й��� �Է����ּ��� >> ");
		String no = StudentEx.scanner.nextLine();
		
		System.out.println("�Է��� �л���" + "" + "�Դϴ�");
		System.out.print("� ������ �����Ͻðڽ��ϱ�? \n1.�̸� 2.�������� 3.�������� 4.�������� >> ");
		int input = Integer.parseInt(StudentEx.scanner.nextLine());
		switch (input) {
		case 1:
			System.out.println("������ �̸��� �Է��ϼ���");
			String name = StudentEx.scanner.nextLine();
			break;
		case 2:
			System.out.println("������ ���������� �Է��ϼ���");
			int kor = Integer.parseInt(StudentEx.scanner.nextLine());
			break;
		case 3:
			System.out.println("������ ���������� �Է��ϼ���");
			int eng = Integer.parseInt(StudentEx.scanner.nextLine());
			break;
		case 4:
			System.out.println("������ ���������� �Է��ϼ���");
			int math = Integer.parseInt(StudentEx.scanner.nextLine());
			break;

		default:
			System.out.println("�߸��� �Է������Դϴ�.");
			break;
		}
		
	
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				break;
			}			
		}
		
		System.out.print("�����Ǿ����ϴ�. ������ �Է°���" + input + "�Դϴ�.");
		
		
	}
	
	//����

}
