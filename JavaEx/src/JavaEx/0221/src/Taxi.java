
public class Taxi {
	public String taxiColor;
	public int passengerCount;
	public int money;

	public Taxi(String taxiColor) {
		this.taxiColor = taxiColor;
	}

	public void take(int money) {
		this.money = this.money + money;
		passengerCount++;
	}

	public void showInfo() {
		System.out.println(taxiColor + "�� �ýø� ź �°��� " + passengerCount + "�� �̰�, ������ " + money + "�Դϴ�.");
		System.out.println("---------------------------------------------");
	}

}
