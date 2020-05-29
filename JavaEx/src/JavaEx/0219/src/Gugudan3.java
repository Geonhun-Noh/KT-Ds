/*
 * 2020.02.19
 * 노건훈
 * 실습 예제 구구단3
 */
public class Gugudan3 {
	public static void main(String[] args) {
		
		for(int a=2;a<10;a++) {
			for(int i=1;i<10;i++) {
				if (a>=i) {
					System.out.println(a + "*" + i + "="+a*i);
				}
			}
			System.out.println("------------------------------------");
		}
	}

}
