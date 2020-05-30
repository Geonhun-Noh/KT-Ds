/*
 * 2020.02.20
 * �����
 * MyDate �޼ҵ�
 */
public class MyDate {
	private int day;
	private int month;
	private int year;

	public int getDay() {
		return day;
	} // ��¥�� ��ȯ�޴� �޼ҵ�

	public void setDay(int day) {
		this.day = day;
	} // ��¥�� �Է��ϴ� �޼ҵ�

	public int getMonth() {
		return month;
	} // ���� ��ȯ�޴� �޼ҵ�

	public void setMonth(int month) {
		this.month = month;
	} // ���� �Է��ϴ� �޼ҵ�

	public int getYear() {
		return year;
	} // ������ ��ȯ�޴� �޼ҵ�

	public void setYear(int year) {
		this.year = year;
	} // ������ �Է��ϴ� �޼ҵ�

	// ��¥ ��ȿ���� Ȯ���ϴ� �޼ҵ�
	public boolean isValid() {
		boolean result = true;

		if (this.month > 12 || this.month < 1 || this.day < 1 || this.day > 31 || this.year < 1) {
			result = false;
			System.out.println("��¥�� ��ȿ���� �ʽ��ϴ�.");
		} else if (this.day == 31 && (this.month != 1 && this.month != 3 && this.month != 5 && this.month != 7
				&& this.month != 8 && this.month != 10 && this.month != 12)) {
			System.out.println("��¥�� ��ȿ���� �ʽ��ϴ�.");
			result = false;
		} else if (this.month == 2 && this.day > 28) {
			System.out.println("��¥�� ��ȿ���� �ʽ��ϴ�.");
			result = false;
		} else {
			System.out.println("�Է��Ͻ� ��¥�� ��ȿ�մϴ�.");
		}
		return result;
	}

	// ������ �޼ҵ�
	public MyDate(int day, int month, int year) {
		this.setYear(year);
		this.setMonth(month);
		this.setDay(day);
		System.out.println("�Է��Ͻ� ��¥�� " + year + "�� " + month + "�� " + day + "�� �Դϴ�.");
	}

}
