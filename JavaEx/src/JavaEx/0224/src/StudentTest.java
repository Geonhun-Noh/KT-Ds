/*
 * 2020.02.24
 * 노건훈
 * static 변수 Test
 */
public class StudentTest {
	public static void main(String[] args) {
		Student studentYeon = new Student(); //studentYeon이라는 student클래스의 인스턴스 생성
		studentYeon.studentName = "연주미"; //이름 설정
		System.out.println(studentYeon.studentName); //serialNum = 1001
		System.out.println(studentYeon.studentName + " 학번 : "+ studentYeon.studentID);
		System.out.println(studentYeon.studentName+ "의 카드번호는 " + studentYeon.cardID + "입니다.");
		
		System.out.println("-----------------------------");
		
		Student studentLee = new Student(); //studentLee이라는 student클래스의 인스턴스 생성
		studentLee.setStudentName("이지안");
		System.out.println(studentLee.getStudentName()); //serialNum = 1002
		System.out.println(studentLee.studentName + " 학번 : " + studentLee.studentID);
		System.out.println(studentLee.studentName+ "의 카드번호는 " + studentLee.cardID + "입니다."); 
	}

}
