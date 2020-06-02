/*
 * 2020.02.24
 * �����
 * ��� (Customer)
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
		return customerName + "���� ����� "+ customerGrade + "�̰�, ���ʽ� ����Ʈ�� " + bonusPoint+ "�Դϴ�.";
	}
	
	public String showPrice(int price) {
		return customerName + "���� �����ؾ� �ϴ� �ݾ��� "+calcPrice(price)+"�� �Դϴ�.";
	}

}
