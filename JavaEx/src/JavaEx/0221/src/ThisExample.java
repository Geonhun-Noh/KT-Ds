class BirthDay {
	int day;
	int month;
	int year;

	public void setYear(int year) {
		this.year = year;
	}

	public void printThis() {
		System.out.println(this.year + "³â " + this.month + "¿ù " + this.day + "ÀÏ");
	}
}

public class ThisExample {
	public static void main(String[] args) {
		BirthDay bDay1 = new BirthDay();
		BirthDay bDay2 = new BirthDay();
		bDay1.setYear(2000);
		System.out.println(bDay1);
		System.out.println(bDay2);
		bDay1.printThis();
	}

}
