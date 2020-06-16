
public class Lambda_Add {
	public static void main(String[] args) {
		int i1 = 52;
		int i2 = 11;
		
		Calc addCal = (s,v) -> s+v;
		System.out.println(addCal.add(i1, i2));
	}

}
