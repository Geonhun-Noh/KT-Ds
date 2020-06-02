/*
 * 2020.02.24
 * 노건훈
 * static 변수
 */
public class Student {
	private static int serialNum = 1000;
	//클래스로부터 생성된 인스턴스들끼리 'serialNum'을 공유함으로써 중복되지 않도록 한다.
	//static 변수는 인스턴스마다 생성되는 변수가 아니라, 클래스에 속해 한번만 생성되는 변수이고 여러 인스턴스가 공유한다.
	int studentID;
	String studentName;
	int grade;
	String address;
	int cardID;
	
	public Student() {
		serialNum ++; //클래스가 생성될 때 마다 serialNum이 1씩 증가하며, 그 값은 다음 클래스 생성 시 기본값으로 유지된다.
		studentID = serialNum;
		cardID = studentID + 100; // 학생카드번호 = 학번 + 100
	}

	public String getStudentName() { //학번 값을 불러오는 메소드
		return studentName;
	}

	public void setStudentName(String studentName) { //학번 값을 입력하는 메소드
		this.studentName = studentName;
	}
	

}
