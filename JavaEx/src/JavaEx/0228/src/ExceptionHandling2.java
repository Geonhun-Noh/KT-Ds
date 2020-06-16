import java.io.*;

public class ExceptionHandling2 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a.txt");
		} catch(FileNotFoundException e) {
			System.out.println(e);
			return; 
			// return이 실행됨에 따라 프로그램을 끝이 나고, Finally가 수행됨.
			// 만약 return이 없으면 아래의 "여기도 수행됩니다."도 출력된다.
		} finally { //항상 수행되는 부분
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("항상 수행 됩니다.");
		}
		System.out.println("여기도 수행됩니다.");//왜 안돌아가지? -> finally 바깥이라 안돌아감.
	}

}
//예외 발생 여부와 상관없이 마지막에 반드시 실행되어야 하는 코드는 finally를 사용한다.
//try블록이 수행되면 finally 블록은 어떤 경우에도 반드시 수행된다.