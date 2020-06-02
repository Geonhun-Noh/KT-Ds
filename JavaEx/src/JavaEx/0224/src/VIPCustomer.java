import java.util.*;

/*
 * 2020.02.24
 * �����
 * ��� (VIPCustomer)
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
		return customerName + "���� ����� " + customerGrade + "�̰�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�.";
	}

	public static void main(String[] args) {
		/*
		 * Customer cust1 = new Customer(); VIPCustomer cust2 = new VIPCustomer();
		 * 
		 * cust1.customerName = "������"; cust2.customerName = "������";
		 * 
		 * System.out.println(cust1.customerName +
		 * "���� �����ؾ� �ϴ� �ݾ��� "+cust1.calcPrice(10000)+"�� �Դϴ�.");
		 * System.out.println(cust2.customerName +
		 * "���� �����ؾ� �ϴ� �ݾ��� "+cust2.calcPrice(10000)+"�� �Դϴ�.");
		 * 
		 * System.out.println(cust1.showCustomerInfo());
		 * System.out.println(cust2.showCustomerInfo());
		 */

		for (int a = 1; a < 6; a++) {
			// �̸� �Է�
			System.out.println("ȸ���� �̸��� �Է��ϼ���.");
			Scanner input1 = new Scanner(System.in);
			String name = input1.next();

			// ���� ���� �Է�
			System.out.println("���� ������ �Է��ϼ���.");
			Scanner input2 = new Scanner(System.in);
			int price = input2.nextInt();

			// ȸ�� ��� �Է�
			System.out.println("ȸ���� ����� �Է��ϼ���.(SILVER:1, GOLD:2, VIP:3)");
			Scanner input3 = new Scanner(System.in);
			int grade = input3.nextInt();

			// ����� Silver�� ���
			if (grade == 1) {
				Customer cust1 = new Customer();
				cust1.customerName = name;
				System.out.println(cust1.showPrice(price));
				System.out.println(cust1.showCustomerInfo());
			}

			// ����� Gold�� ���
			else if (grade == 2) {
				Customer cust2 = new GoldCustomer();// ��ӹ޴� Ŭ������ ����ϴ� Ŭ������ ��ü�� ������ �� �ִ�.
				cust2.customerName = name;
				System.out.println(cust2.showPrice(price));
				System.out.println(cust2.showCustomerInfo());
			}

			// ����� VIP�� ���
			else if (grade == 3) {
				Customer cust = new VIPCustomer();// ��ӹ޴� Ŭ������ ����ϴ� Ŭ������ ��ü�� ������ �� �ִ�.
				cust.customerName = name;
				System.out.println(cust.showPrice(price));
				System.out.println(cust.showCustomerInfo());
			}

			// ��� �ƴ� ���
			else {
				System.out.println("����� ��ȿ���� �ʽ��ϴ�.");
			}
			System.out.println("---------------------------------------");

		}

	}
}