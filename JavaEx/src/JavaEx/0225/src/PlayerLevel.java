/*
 * 2020.02.25
 * �����
 * �߻�Ŭ���� �ǽ�����
 */

public abstract class PlayerLevel {
	public abstract void run();
	public abstract void jump(int count);
	public abstract void turn();
	public abstract void showLevelMessage();
	final public void go(int count) {//countȽ�� ��ŭ run, jump, turn ����
		run();
		jump(count);
		turn();
	}
}
