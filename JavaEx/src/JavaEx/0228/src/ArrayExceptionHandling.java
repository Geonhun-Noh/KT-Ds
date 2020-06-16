

//예외처리를 사용하면 프로그램이 비정상 종료되는 것을 방지한다.(Terminate되지 않고 끝까지 실행되도록 함.)
public class ArrayExceptionHandling {
	public static void main(String[] args) {
		int[] arr = new int[5];
		try { //try문을 실행하다가 에러 발생하면 catch로 넘어감
			for(int i =0;i<=7;i++) {
				arr[i]=i;
				System.out.println(arr[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) { //try에서 에러 발생 시 catch로 넘어와서 실행
			System.out.println(e);
			System.out.println("예외처리부분");
		}
		System.out.println("프로그램 종료");
	}

}
