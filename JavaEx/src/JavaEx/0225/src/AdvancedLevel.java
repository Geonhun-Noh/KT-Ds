/*
 * 2020.02.25
 * 노건훈
 * 추상클래스 실습예제
 */

public class AdvancedLevel extends PlayerLevel{
	public void run() {
		System.out.println("천천히 달립니다.");
	}
	public void jump(int count) {
		System.out.println(count + "번 Jump 합니다.");
	}
	public void turn() {
		System.out.println("turn 할 수 없습니다.");
	}
	public void showLevelMessage() {
		System.out.println("***** 중급자 레벨입니다. *****");
	}

}
