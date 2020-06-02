/*
 * 2020.02.25
 * �����
 * �߻�Ŭ���� �ǽ�����
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
	public void play(int count) {//go�� �Ű����� count ����
		level.go(count);
	}

}
