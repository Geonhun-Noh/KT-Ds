//���� ���� Ŭ������ �ܺ� Ŭ������ �������� �ʴ��� �ٷ� ���� ���� Ŭ������ ������ �� �ִ�.


public class InnerTest {
	public static void main(String[] args) {
		OutClass.InStaticClass slnClass = new OutClass.InStaticClass();
		/*�ν��Ͻ� ���� Ŭ������ OutClass outClass = new OutClass();
		 *��ó�� �����ؾ� ������, ���� ���� Ŭ������ �ٷ� ����� ȣ���Ͽ� ����� �� �ִ�. 
		 */
		System.out.println("���� ���� Ŭ���� �Ϲ� �޼��� ȣ��");
		slnClass.inTest();
		
		System.out.println();
		
		System.out.println("���� ���� Ŭ������ ����ƽ �޼ҵ� ȣ��");
		OutClass.InStaticClass.sTest();
	}

}
