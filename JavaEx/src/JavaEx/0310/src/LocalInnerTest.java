//Outer Ŭ������ ���ǵ� getRunnable() �޼ҵ� ȣ���� ���� ������ ��ü�� ��ȯ�޴´�.

public class LocalInnerTest {
	public static void main(String[] args) {
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);	//Ŭ���� ����
		runner.run();							//�޼ҵ� ȣ��
	}

}
