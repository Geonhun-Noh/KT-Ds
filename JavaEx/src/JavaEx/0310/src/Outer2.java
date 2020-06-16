//익명클래스는 클래스 이름을 사용하지 않는 클래스이다.

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
			System.out.println("Runnable 이 구현된 익명 클래스 변수");
		}
	};

}
