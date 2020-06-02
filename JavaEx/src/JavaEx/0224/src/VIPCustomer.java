import java.util.*;

/*
 * 2020.02.24
 * 노건훈
 * 상속 (VIPCustomer)
 */
public class VIPCustomer extends Customer {
	double saleRatio;

	public VIPCustomer() {
		super();
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int) (price * saleRatio);
	}

	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이고, 보너스 포인트는 " + bonusPoint + "입니다.";
	}

	public static void main(String[] args) {
		/*
		 * Customer cust1 = new Customer(); VIPCustomer cust2 = new VIPCustomer();
		 * 
		 * cust1.customerName = "연초코"; cust2.customerName = "연주은";
		 * 
		 * System.out.println(cust1.customerName +
		 * "님이 지불해야 하는 금액은 "+cust1.calcPrice(10000)+"원 입니다.");
		 * System.out.println(cust2.customerName +
		 * "님이 지불해야 하는 금액은 "+cust2.calcPrice(10000)+"원 입니다.");
		 * 
		 * System.out.println(cust1.showCustomerInfo());
		 * System.out.println(cust2.showCustomerInfo());
		 */

		for (int a = 1; a < 6; a++) {
			// 이름 입력
			System.out.println("회원의 이름을 입력하세요.");
			Scanner input1 = new Scanner(System.in);
			String name = input1.next();

			// 구매 가격 입력
			System.out.println("구매 가격을 입력하세요.");
			Scanner input2 = new Scanner(System.in);
			int price = input2.nextInt();

			// 회원 등급 입력
			System.out.println("회원의 등급을 입력하세요.(SILVER:1, GOLD:2, VIP:3)");
			Scanner input3 = new Scanner(System.in);
			int grade = input3.nextInt();

			// 등급이 Silver일 경우
			if (grade == 1) {
				Customer cust1 = new Customer();
				cust1.customerName = name;
				System.out.println(cust1.showPrice(price));
				System.out.println(cust1.showCustomerInfo());
			}

			// 등급이 Gold일 경우
			else if (grade == 2) {
				Customer cust2 = new GoldCustomer();// 상속받는 클래스는 상속하는 클래스로 객체를 생성할 수 있다.
				cust2.customerName = name;
				System.out.println(cust2.showPrice(price));
				System.out.println(cust2.showCustomerInfo());
			}

			// 등급이 VIP일 경우
			else if (grade == 3) {
				Customer cust = new VIPCustomer();// 상속받는 클래스는 상속하는 클래스로 객체를 생성할 수 있다.
				cust.customerName = name;
				System.out.println(cust.showPrice(price));
				System.out.println(cust.showCustomerInfo());
			}

			// 모두 아닐 경우
			else {
				System.out.println("등급이 유효하지 않습니다.");
			}
			System.out.println("---------------------------------------");

		}

	}
}