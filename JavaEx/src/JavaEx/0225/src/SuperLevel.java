/*
 * 2020.02.25
 * �����
 * �߻�Ŭ���� �ǽ�����
 */

public class SuperLevel extends PlayerLevel{
	public void run() {
		System.out.println("õõ�� �޸��ϴ�.");
	}
	public void jump(int count) {
		System.out.println(count + "�� Jump �մϴ�.");
	}
	public void turn() {
		System.out.println("�ѹ� turn �մϴ�.");
	}
	public void showLevelMessage() {
		System.out.println("***** ����� �����Դϴ�. *****");
	}

}
