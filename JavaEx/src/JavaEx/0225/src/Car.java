/*
 * 2020.02.25
 * �����
 * �߻�Ŭ����/���
 */
public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	final public void run() {//final�� ����� ��� �ٸ� ���� ������ �� ����.
		startCar();
		drive();
		stop();
		turnOff();
	}

}
