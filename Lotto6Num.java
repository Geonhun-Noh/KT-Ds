/*
 * 1. 서로 다른 6개의 정수를 저장할 배열을 선언한다.
 * 2. 1~45 사이 임의의 정수를 만든다.
 * 3. 얻은 정수가 배열에 포함된 수인지 확인하고 포함되지 않은 정수만 배열에 저장한다.
 * 4. 같은 방법으로 서로 다른 6개의 수가 배열에 저장될 때까지 3을 반복한다.
 * 5. 배열을 증가순으로 정렬한다.
 */

package LottoEx;
import java.util.Arrays;

public class Lotto6Num {
	private int[] lots;			//배열선언
	private int base;			//전체 공 개수 45
	private int ballNum;		//저장할 공 개수 6
	//로또 공의 개수와 배열에 저장할 로또 공의 개수(배열의 크기) 저장하고, 배열 생성
	
	public Lotto6Num(int base, int ballNum) {
		this.ballNum=ballNum;
		this.base = base;
		//배열생성
		lots = new int[ballNum];
	}
	
	public Lotto6Num() {		//공 개수 45, 배열크기 6으로 초기화
		this(45,6);
	}
	
	//일차원 배열 출력
	public void print() {
		for(int i = 0;i<lots.length;i++) {
			if(i==lots.length-1) {
				System.out.printf("%d",lots[i]);
			}
			else {
				System.out.printf("%d,", lots[i]);
			}
		}
		System.out.println();
	}
	
	//임의 정수 만들기
	private int rand() {
		return (int)(Math.random()*base)+1;
	}
	
	//n이 배열에 포함되는지 판단
	public boolean contain(int n) {
		boolean isC = false;
		for(int i = 0; i<lots.length;i++) {
			if(lots[i]==n) {
				isC=true;
				break;
			}
		}
		return isC;
	}
	
	public void make() {
		Arrays.fill(lots,0);		//배열 0으로 초기화
		int count = 0;
		while(count!=ballNum) {		//6개의 다른 정수가 채워질 때까지 반복
			int temp=rand();		//1~45 사이 임의의 정수 만들기
			if(! contain(temp)) {	//배열에 포함되어 있지 않으면 배열에 저장, 저장개수가 증가
				lots[count++]=temp;
			}
		}
		Arrays.sort(lots);			//배열을 증가순으로 정렬
	}
	
	public int[] getLots() {		//배열 반환
		return lots;
	}

}
