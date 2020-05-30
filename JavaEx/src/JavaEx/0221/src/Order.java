
public class Order {
	public static void main(String[] args) {
		Customer cst1 = new Customer("Frank", 1, 5, 50000);
		Customer cst2 = new Customer("Gerrard", 2, 3, 45000);
		Customer cst3 = new Customer("Scholes", 3, 2, 46000);

		Americano ame = new Americano();
		Latte lat = new Latte();

		cst1.takeCoffee(ame, lat);
		cst1.showInfo();

		cst2.takeCoffee(ame, lat);
		cst2.showInfo();

		cst3.takeCoffee(ame, lat);
		cst3.showInfo();
	}

}
