/*
 * 2020.02.25
 * 노건훈
 * 추상클래스/상속
 */
public class Bus extends Car1 {
	public void run() {
		System.out.println("버스가 달립니다.");
	}

	public void refuel() {
		System.out.println("천연가스를 충전합니다.");
	}

	public void takePassenger() {
		System.out.println("승객을 버스에 태웁니다.");
	}

}
