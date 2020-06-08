package Collection;

public class Student {
	private int studentID;
	private String studentName;
	
	public Student(int studentID, String studentName) {
		this.studentID=studentID;
		this.studentName=studentName;
	}
	
	public int getStudentID() {//memberID�� private�̱� ������ getMemberID�� �� ��ȯ
		return studentID;
	}
	public void setStudentID(int studentID) {//setMemberID�� ID�� �Է�
		this.studentID = studentID;
	}
	public String getStudentName() {//getMemberName���� memberID �� ��ȯ
		return studentName;
	}
	public void setStudentName(String studentName) {//setMemberName���� �̸��� �Է�
		this.studentName=studentName;
	}
	
	@Override
	public String toString() {
		//�̹� ��ü ���ǵ� �޼ҵ��̴�. Member�� ������ ȣ���ؼ� ������� �� �ּҰ��� ��������
		//���ϰ��� ������ ���� �����Ͽ� Member Ŭ���� ���� �� ���� ���ϰ����� ��ȯ�ȴ�.
		return studentName +":"+ studentID;
	}
	
	@Override
	public int hashCode() { //���� �ּҰ��� ��ȯ�ϴ� �޼ҵ带 �������̵��ؼ� ID������ ��ȯ�ϵ���.
		return studentID;
	}
	
	@Override
	public boolean equals(Object obj) {//�������̵��ؼ� ID���� ���ϵ���.
		if(obj instanceof Student) {
			Student student = (Student)obj;
			if(this.studentID == student.studentID)
				return true;
			else return false;
				
		}
		return false;
	}

}



