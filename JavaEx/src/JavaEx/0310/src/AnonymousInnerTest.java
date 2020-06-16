//익명클래스를 만든 Outer2를 사용해서 내부 클래스 활용

public class AnonymousInnerTest {
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		
		Runnable runner = out.getRunnable(10);
		runner.run();
		
		out.runner.run();
	}

}
