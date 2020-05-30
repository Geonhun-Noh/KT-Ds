
public class StudentTest {
	public static void main(String[] args) {
		Student StudentLee = new Student();//객체 선언
	
		//StudentLee.studentName = "연초코"; //Student 클래스의 studentName을 private으로 설정해놨기 때문에 해당 변수를 찾지 못하는 에러 발생
		StudentLee.setStudentName("연초코"); // Student 클래스 내부에서 변수 값을 설정할 수 있는 함수를 사용하여 studentName을 설정. private이어도 가능.
		System.out.println(StudentLee.getStudentName());
	}

}
