//Outer 클래스에 정의된 getRunnable() 메소드 호출을 통해 생성된 객체를 반환받는다.

public class LocalInnerTest {
	public static void main(String[] args) {
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);	//클래스 생성
		runner.run();							//메소드 호출
	}

}
