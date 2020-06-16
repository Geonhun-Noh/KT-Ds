//정적 내부 클래스는 외부 클래스를 생성하지 않더라도 바로 정적 내부 클래스를 생성할 수 있다.


public class InnerTest {
	public static void main(String[] args) {
		OutClass.InStaticClass slnClass = new OutClass.InStaticClass();
		/*인스턴스 내부 클래스는 OutClass outClass = new OutClass();
		 *위처럼 생성해야 하지만, 정적 내부 클래스는 바로 기능을 호출하여 사용할 수 있다. 
		 */
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		slnClass.inTest();
		
		System.out.println();
		
		System.out.println("정적 내부 클래스의 스태틱 메소드 호출");
		OutClass.InStaticClass.sTest();
	}

}
