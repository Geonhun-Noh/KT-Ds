/*
 * 2020.02.25
 * 노건훈
 * 추상클래스/상속
 */
public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	final public void run() {//final로 선언된 경우 다름 값을 대입할 수 없다.
		startCar();
		drive();
		stop();
		turnOff();
	}

}
