
public class OutClass {
	//private int num = 10;
	private static int sNum = 20;
	static class InStaticClass{
		int inNum = 100;
		static int slnNum = 200;
		void inTest() {
			//num += 10;
			System.out.println("InStaticClass inNum = " + inNum + "(���� Ŭ������ �ν��ϼ� ���� ���)");
			System.out.println("InStaticClass slnNum = " + slnNum + "(���� Ŭ������ ����ƽ ���� ���)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ���� ���)");
		}
		
		static void sTest() {
			//num += 10;
			//inNum += 10;
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ���� ���)");
			System.out.println("InStaticClass slnNum = " + slnNum + "(���� Ŭ������ ����ƽ ���� ���)");
		}
	}

}
