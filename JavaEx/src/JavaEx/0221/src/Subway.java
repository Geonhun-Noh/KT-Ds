
public class Subway {
	public String lineNumber;
	public int passengerCount;
	public int money;

	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}

	public void take(int money) {
		this.money = this.money + 1500;
		passengerCount++;
	}

	public void showInfo() {
		System.out.println(lineNumber + "�� �°��� " + passengerCount + "�� �̰�, ������ " + money + "�Դϴ�.");
		System.out.println("---------------------------------------------");
	}

}
