package studentTecher;

public class StudentService {
	
	// 01/17 : Student �ʵ� ����, main �޼��� �޴� ����
	// 01/18 : ������ �ۼ�, ��ȸ���, ��ϱ�� ����
	// 01/19 : toString����, ������� ����
	
// ��� ��� Ŭ����
	//MVC Model View Controller
	/*
	 * ������ MVC ����
	 * 
	 * Model
	 * 
	 * �������� ���� ���°�
	 * ��ûó�� ��Ʈ�ѷ��� �ϰ�
	 * DBó�� ��ó���� 
	 * �並���� ������
	 * 
	 * ���� = business logic
	 */
	//��ü�迭 �ν��Ͻ����� 
	Student[] students = new Student[10]; //�л��� ����
	
	//220119 �߰�
	int cnt; // ��ƮŸ�� ī��Ʈ. ���⿡ �����л��ο��� ������
		//�̰� ������ ����
	
	
	//�л� ������ ���⿡ �� ����
	
//	�� �̰� ���������	
	// Student ��ü�� �̹� �����ڷ���
	// []�迭 �� �����ڷ���
	// �����ڷ����� �����ߴ�
	
	// ��� ���ڿ� �迭�� ���� �����̱��ѵ� String[] �Ѵܰ� ����� String �⺻���� �Ǵµ� ���� ���� ���ܵ� ����
	// ŷ����
	
	/*
	 * ��� public Ŭ���������� ��� ����
	 * 
	 * �ǹؿ� main ���� �����Ұ�
	 */
	
//	public StudentService() { //StudentService �⺻������ => ���ھ��� �Ҷ� ����
//		// TODO Auto-generated constructor stub
//	}
	
//							  //�ʱ�ȭ��
//	public StudentService() { //��Ʃ��Ʈ���� ������
//		for (int i = 0; i < 5; i++) {
//			students[i] = new Student("220001", "ȫ�浿", 80, 80, 80);
//		} //for���� �׻� �ż��� ���� �־���ϰ�, print�� �޼��� ���뿡 �־���� 
//	}	  // ,but {}��ó�� ���ָ� ������ ���η� �νĵż� ����
//	
	//220119 �߰�
	String[] names = {"��溸", "�赿��", "�����", "�����", "�迹��", "��ġ��", "������"};
	
	//���� 220119 �й� �� �ٸ��� �ٽ� ����
	//�ʱ�ȭ�� ��Ʃ��Ʈ cnt�� �������� + �����־ ���� �� �� �ٸ��� ����Ұ� 60~100���̷�
	
	public StudentService() { //��Ʃ��Ʈ���� ������
		for (int i = 0; i < names.length; i++) {
			students[cnt] = new Student(220000 + cnt + 1 + "", names[cnt], getScore(), getScore(), getScore());
			cnt++;
		} //for���� �׻� �ż��� ���� �־���ϰ�, print�� �޼��� ���뿡 �־���� 
	}	  // ,but {}��ó�� ���ָ� ������ ���η� �νĵż� ����
	
	
//	students[cnt++] = new Student("220001", "��浿", 80, 80, 80); //���� �̷��� �����
//	students[cnt++] = new Student("220002", "�̱浿", getScore(), getScore(), getScore());
//	students[cnt++] = new Student(220000 + cnt + 1 + "", "��浿", getScore(), getScore(), getScore()); //���� �̷��� �����
//	students[cnt++] = new Student("220003", "��浿", 80, 80, 80); //���� �̷��� �����
	
	//220119 �߰�  �������� �߰��ؼ� ���� ������ ���ʱ�ȭ
	int getScore() {
		return (int)(Math.random()*41)+60;
	}
	
	
	
//	CRUD Create Read U? Delete
	// 1. ��ȸ
	//��� �޼���� void�� �ؼ� ���Ͼ���
	void list() {
		//���� �� �л������ͷ�
		//��ȸ��� ����

		System.out.println("�й�\t\t�̸�\t\t����\t����\t����\t����\t���");
		System.out.println("=====================================================================");
//		for (int i = 0; i < cnt; i++) { //�ν��Ͻ� �޼��峢�� �� Ŭ���� �Ⱥ���
		for (int i = 0; i < students.length; i++) { //�ν��Ͻ� �޼��峢�� �� Ŭ���� �Ⱥ���
			if(students[i] != null) { //null�� �ƴҶ�.
//			System.out.print(students[i].no);
//			System.out.print("    ");
//			System.out.print(students[i].name);
//			System.out.print("    ");
//			System.out.print(students[i].kor);
//			System.out.print("    ");
//			System.out.print(students[i].eng);
//			System.out.print("    ");
//			System.out.print(students[i].math);
//			System.out.print("    ");
//			System.out.print(students[i].sum());
//			System.out.print("    ");
//			System.out.print(students[i].avg());
//			System.out.println();
			System.out.print(students[i].no + "\t\t" + students[i].name + "\t\t" + students[i].kor + "\t" + students[i].eng + "\t" + students[i].math + "\t" + students[i].sum() + "\t" + students[i].avg() +"\n" );

			
//	220119		// toString ����ؼ� �����ϼ� 
			
			
			}//�̷��� �ϳ��ϳ� ����� �ϴ°ſ����� 
		} //null Ȯ���ϰ� �ʱ�ȭ ��Ű�� .. ������ �ʸ��򰥸��ϴ�
	}
	
	// 2. ���
	void register() { //�ڵ����� ���ϰ� o, �����ڴ� ���ϰ��� ����

		//��ϱ�� ����
		
		//��� ���� �޾Ƽ� � �������� ������ ������ Ȯ���ϰ� ���ؾ� ��
		//���������� �Է¹��� �ν��Ͻ��� public class Student ��������
		// �� �л��� students �� �����ؾ���
		// ���°��ġ��? 
		
		/* �ؾ��� ����
		 * 1. ������ �Է¹ޱ� ==> Scanner Ŭ���� instance�� �Է��� ����
		 * ��ĳ�ʸ� Ŭ���� ������ �س�����
		 * StudentEx.scanner.nextLine();�� �ؿ� �� �ִ�
		 * 2. �Է¹��� �����͸� Student Ÿ���� �ν��Ͻ��� ����
		 * 3. students �迭�� null ��ġ�� ����
		 */
		
		//1 ������ �Է¹ޱ�
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
		//2 �Է¹��� �����͸� �л�Ÿ���� �ν��Ͻ��� ���� ==> 1�� �Է� ���ؾ��Ѵ�
		Student student = new Student(no, name, kor, eng, math);
//220119		//3 students �迭�� cnt��ġ�� ����
//		students[cnt++] = student; �� ����
		//3 students �迭�� null��ġ�� ����
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				break;			
			}
		}
	}
	
	
	// 3. ����
	void modify() {
		//�й����� �л��� Ž�� �� �л� ������ �� �̸� , ���� ����
		//�����
	}
	
	// 4. ����
	
	
	
	
	////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		/*
		 * 
		 * ���� �ִ� students�� 
		 * new�� ���� �ν��Ͻ� �����Ұ���
		 */
		
		
		//�ٵ� ��ġ ����� �ߺ�����. ���� �ִ°� studentService��
		StudentService service = new StudentService(); //�̰� �����ؾ��� students[i]��밡��
//		System.out.println(service.students[]);
		
		
// 		�ʱ�ȭ ��Ŵ
//		service.students[0] = new Student("220002", "��浿", 70, 60, 50);
		//�ʱ�ȭ �Ƚ�Ű��.no �ϸ� nullpointexception��
	
		
//		//��ȸ��ɱ���
//		for (int i = 0; i < service.students.length; i++) {
//			System.out.println(service.students[i]);
//		}
		
//		System.out.println(service.students[0].no); //������ ȣ��� 
//		service.students[0] ==> ���� Student
		
		service.list();
		
		
		
		// StudentServiceŬ������ Student[]�迭Ÿ���̴�
		// service.students�� Ÿ�� = Student[] �迭Ÿ��
		
		
	}
}
