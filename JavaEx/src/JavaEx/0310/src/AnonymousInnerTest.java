//�͸�Ŭ������ ���� Outer2�� ����ؼ� ���� Ŭ���� Ȱ��

public class AnonymousInnerTest {
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		
		Runnable runner = out.getRunnable(10);
		runner.run();
		
		out.runner.run();
	}

}
