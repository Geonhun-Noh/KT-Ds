//�͸�Ŭ������ Ŭ���� �̸��� ������� �ʴ� Ŭ�����̴�.

public class Outer2 {
	Runnable getRunnable(int i) {
		int num = 100;
		return new Runnable() {
			@Override
			public void run() {
				//num = 200;
				//i = 10;
				System.out.println(i);
				System.out.println(num);
			}
		};
	}
	Runnable runner = new Runnable() {
		@Override
		public void run() {
			System.out.println("Runnable �� ������ �͸� Ŭ���� ����");
		}
	};

}
