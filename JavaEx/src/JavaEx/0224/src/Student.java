/*
 * 2020.02.24
 * �����
 * static ����
 */
public class Student {
	private static int serialNum = 1000;
	//Ŭ�����κ��� ������ �ν��Ͻ��鳢�� 'serialNum'�� ���������ν� �ߺ����� �ʵ��� �Ѵ�.
	//static ������ �ν��Ͻ����� �����Ǵ� ������ �ƴ϶�, Ŭ������ ���� �ѹ��� �����Ǵ� �����̰� ���� �ν��Ͻ��� �����Ѵ�.
	int studentID;
	String studentName;
	int grade;
	String address;
	int cardID;
	
	public Student() {
		serialNum ++; //Ŭ������ ������ �� ���� serialNum�� 1�� �����ϸ�, �� ���� ���� Ŭ���� ���� �� �⺻������ �����ȴ�.
		studentID = serialNum;
		cardID = studentID + 100; // �л�ī���ȣ = �й� + 100
	}

	public String getStudentName() { //�й� ���� �ҷ����� �޼ҵ�
		return studentName;
	}

	public void setStudentName(String studentName) { //�й� ���� �Է��ϴ� �޼ҵ�
		this.studentName = studentName;
	}
	

}
