/*
 * 2020.02.25
 * 노건훈
 * 추상클래스 실습예제
 */

public abstract class PlayerLevel {
	public abstract void run();
	public abstract void jump(int count);
	public abstract void turn();
	public abstract void showLevelMessage();
	final public void go(int count) {//count횟수 만큼 run, jump, turn 진행
		run();
		jump(count);
		turn();
	}
}
