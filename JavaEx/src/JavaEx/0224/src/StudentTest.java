/*
 * 2020.02.24
 * �����
 * static ���� Test
 */
public class StudentTest {
	public static void main(String[] args) {
		Student studentYeon = new Student(); //studentYeon�̶�� studentŬ������ �ν��Ͻ� ����
		studentYeon.studentName = "���ֹ�"; //�̸� ����
		System.out.println(studentYeon.studentName); //serialNum = 1001
		System.out.println(studentYeon.studentName + " �й� : "+ studentYeon.studentID);
		System.out.println(studentYeon.studentName+ "�� ī���ȣ�� " + studentYeon.cardID + "�Դϴ�.");
		
		System.out.println("-----------------------------");
		
		Student studentLee = new Student(); //studentLee�̶�� studentŬ������ �ν��Ͻ� ����
		studentLee.setStudentName("������");
		System.out.println(studentLee.getStudentName()); //serialNum = 1002
		System.out.println(studentLee.studentName + " �й� : " + studentLee.studentID);
		System.out.println(studentLee.studentName+ "�� ī���ȣ�� " + studentLee.cardID + "�Դϴ�."); 
	}

}
