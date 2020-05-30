
public class Calculator {
	private int a;
	private int b;

	public Calculator() {
		a = 10;
		b = 50;
	}

	public Calculator(int a, int b) {
		this.a = a;
		this.b = b;

	}

	public int f(int x) {
		return a * b + x;
	}

}
