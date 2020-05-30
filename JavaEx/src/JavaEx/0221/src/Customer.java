
public class Customer {
	public String customerName;
	public int ameOrder;
	public int latOrder;
	public int charge;
	public int money;

	public Customer(String customerName, int ameOrder, int latOrder, int money) {
		this.customerName = customerName;
		this.ameOrder = ameOrder;
		this.latOrder = latOrder;
		this.money = money;
	}

	public void takeCoffee(Americano ame, Latte lat) {
		ame.orderCount = this.ameOrder;
		lat.orderCount = this.latOrder;
		this.charge += ame.charge() + lat.charge();
		this.money = this.money - ame.charge() - lat.charge();
	}

	public int totalCount() {
		int total = ameOrder + latOrder;
		return total;
	}

	public void showInfo() {
		System.out.println("주문하신 음료는 총 " + totalCount() + "잔이며 " + charge + "원 결제하면 잔액은 " + money + "입니다.");
	}

}
