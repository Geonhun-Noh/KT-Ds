import java.util.*;

public class SwitchStringCondition {
	public static double toMoney(String c) {
		double tot = 0.0;
		switch(c) {
		case "USD": case "usd":	tot=1126.5;break;
		case "JPY": case "jpy": tot=110.6;break;
		case "CNY": case "cny": tot=10.5;break;
		default:tot=1;break;
		}
		return tot;
	}
	public static void main(String[] args) {
		System.out.println("Ȯ���ϰ��� �ϴ� ȭ�� �����ϸ�, ȯ���� �˷��帳�ϴ�.");
		System.out.println("USD / JPY / CNY");
		Scanner input = new Scanner(System.in);
		String money = input.next();
		//String money = "USD";
		input.close();
		double result = toMoney(money);
		System.out.printf("%s => %.2f��\n",money,result);
	}
	

}

