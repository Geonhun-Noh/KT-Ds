package JavaEx;

public class randChoice {
	public static void main(String[] args) {
		int a1=0;
		int a2=0;
		int a3=0;
		
		while(a1==a2 || a2==a3 || a1==a3) {
			a1 = (int)(Math.random()*10)+1;
			a2 = (int)(Math.random()*10)+1;
			a3 = (int)(Math.random()*10)+1;
		}
		System.out.println(a1+","+a2+","+a3);
		
		
	}
}
