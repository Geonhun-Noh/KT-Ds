package Collection;

public class Student {
	private int studentID;
	private String studentName;
	
	public Student(int studentID, String studentName) {
		this.studentID=studentID;
		this.studentName=studentName;
	}
	
	public int getStudentID() {//memberID가 private이기 때문에 getMemberID로 값 반환
		return studentID;
	}
	public void setStudentID(int studentID) {//setMemberID로 ID값 입력
		this.studentID = studentID;
	}
	public String getStudentName() {//getMemberName으로 memberID 값 반환
		return studentName;
	}
	public void setStudentName(String studentName) {//setMemberName으로 이름값 입력
		this.studentName=studentName;
	}
	
	@Override
	public String toString() {
		//이미 자체 정의된 메소드이다. Member를 실제로 호출해서 사용했을 때 주소값이 보였지만
		//리턴값을 다음과 같이 정의하여 Member 클래스 실행 시 다음 리턴값으로 반환된다.
		return studentName +":"+ studentID;
	}
	
	@Override
	public int hashCode() { //원래 주소값을 반환하던 메소드를 오버라이드해서 ID값으로 반환하도록.
		return studentID;
	}
	
	@Override
	public boolean equals(Object obj) {//오버라이드해서 ID값을 비교하도록.
		if(obj instanceof Student) {
			Student student = (Student)obj;
			if(this.studentID == student.studentID)
				return true;
			else return false;
				
		}
		return false;
	}

}



