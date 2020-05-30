
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
		System.out.println(taxiColor + "색 택시를 탄 승객은 " + passengerCount + "명 이고, 수입은 " + money + "입니다.");
		System.out.println("---------------------------------------------");
	}

}
