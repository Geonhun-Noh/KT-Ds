/*
 * 2020.02.24
 * 노건훈
 * 상속 (Customer)
 */
public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		customerGrade = "Silver";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint  += price*bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은 "+ customerGrade + "이고, 보너스 포인트는 " + bonusPoint+ "입니다.";
	}
	
	public String showPrice(int price) {
		return customerName + "님이 지불해야 하는 금액은 "+calcPrice(price)+"원 입니다.";
	}

}
