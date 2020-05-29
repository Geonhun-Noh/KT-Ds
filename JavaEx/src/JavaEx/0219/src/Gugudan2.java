/*
 * 2020.02.19
 * 노건훈
 * 실습 예제 구구단2
 */
public class Gugudan2 {
	public static void main(String[] args) {
		
		for(int a=2;a<10;a++) {
			if(a%2==0) {
				for(int i=1;i<10;i++) {
					System.out.println(a + "*" + i + "=" + a*i);
					continue;
					}
				System.out.println("------------------------------------");
				}
			}
		}
	}
