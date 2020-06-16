
public class OutClass {
	//private int num = 10;
	private static int sNum = 20;
	static class InStaticClass{
		int inNum = 100;
		static int slnNum = 200;
		void inTest() {
			//num += 10;
			System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴수 변수 사용)");
			System.out.println("InStaticClass slnNum = " + slnNum + "(내부 클래스의 스태틱 변수 사용)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
		}
		
		static void sTest() {
			//num += 10;
			//inNum += 10;
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
			System.out.println("InStaticClass slnNum = " + slnNum + "(내부 클래스의 스태틱 변수 사용)");
		}
	}

}
