
public class StudentTest {
	public static void main(String[] args) {
		Student StudentLee = new Student();//��ü ����
	
		//StudentLee.studentName = "������"; //Student Ŭ������ studentName�� private���� �����س��� ������ �ش� ������ ã�� ���ϴ� ���� �߻�
		StudentLee.setStudentName("������"); // Student Ŭ���� ���ο��� ���� ���� ������ �� �ִ� �Լ��� ����Ͽ� studentName�� ����. private�̾ ����.
		System.out.println(StudentLee.getStudentName());
	}

}
