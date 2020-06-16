import java.io.*;
import java.net.*;

public class ExceptionHandling1 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a.txt");
		} catch(FileNotFoundException e) {
			System.out.println(e); //예외클래스의 toString 호출
		}
		System.out.println("여기도 수행됩니다.");
	}

}
//예외 처리를 한다고 프로그램의 예외 상황 자체를 방지할 수는 없다.
//예외 처리를 하면 예외 상황을 알려주는 메시지를 보는 것, 비정상 종료를 방지할 수는 있다.