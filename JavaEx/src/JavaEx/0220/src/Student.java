
public class Student {
	int studentID;//학번
	private String studentName;//이름
	int grade;//학년
	String address;//주소
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName; // this는 class 자체의 변수를 설정해준다.
	}


}
