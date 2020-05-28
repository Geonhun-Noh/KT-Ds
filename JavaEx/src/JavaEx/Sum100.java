package JavaEx;

public class Sum100 {
	public static void main(String[] args) {
		int sum=0;
		int odd=0;
		int even=0;
		for (int i=1;i<=100;i++) {
			if(i%2==0) {
				even=even+i;
			}
			else {
				odd=odd+i;
			}
		}
		sum=even+odd;
		System.out.println("100까지 홀수의 합 : "+odd);
		System.out.println("100까지 짝수의 합 : "+even);
		System.out.println("100까지 전체의 합 : "+sum);
	}

}
