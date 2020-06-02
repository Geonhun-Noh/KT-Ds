/*
 * 2020.02.25
 * 노건훈
 * 추상클래스 실습예제
 */

public class Player {
	private PlayerLevel level;
	
	public Player() { 
		level = new BeginnerLevel();
		//level.showLevelMessage();
	}
	public PlayerLevel getLevel() {
		return level;
	}
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	public void play(int count) {//go에 매개변수 count 설정
		level.go(count);
	}

}
