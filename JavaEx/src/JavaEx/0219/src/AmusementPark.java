/*
 * 2020.02.19
 * 노건훈
 * 조건제어문 실습예제 1
 */
public class AmusementPark {
	public static void main(String[] args) {
		int age = 18;
		int fee ;
		
		if(age<8) {
			fee = 1000;
		}
		else if(age<14) {
			fee = 2000;
		}
		else if(age<20) {
			fee = 2500;
		}
		else if(age>60) {
			fee = 0;
		}
		else {
			fee = 3000;
		}
		
		System.out.println(fee);
	}

}
