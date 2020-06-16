//지역 내부 클래스는 지역 변수처럼 메소드 내부에 클래스를 정의함
//메소드 안에서만 사용할 수 있다.
public class Outer {
	int outNum = 100;
	static int sNum = 200;
	Runnable getRunnable(int i) {
		int num = 100;							//지역변수
		class MyRunnable implements Runnable{   //지역내부클래스
			int localNum = 10;					//지역내부클래스의 인스턴스 변수
			@Override
			public void run() {
				//num = 200;					//지역변수는 상수로 바뀜, 상수 - 변수역할X, 고정값처럼 할당이 안된다. 
				//i = 100;						//매개 변수 역시 지연변수처럼 상수로 바뀜
				System.out.println("i = " + i);
				System.out.println("num = "+num);
				System.out.println("localNum = "+localNum);
				
				System.out.println("outNum = "+outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outter.sNum = " + Outer.sNum + "(외부 클래스 정적 변수)");
			}
		}
		return new MyRunnable();
	}

}
