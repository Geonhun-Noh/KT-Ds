/*
 * 2020.02.25
 * �����
 * �߻�Ŭ���� �ǽ�����
 */

import java.util.*;

public class MainBoard {
	public static void main(String[] args) {

		System.out.println("�÷����� ������ �������ּ���."); // ���� �Է� �ޱ�
		System.out.println("(Beginner, Advanced, Super �� ����)");
		Scanner a = new Scanner(System.in);
		String level = a.next();

		System.out.println("�÷��� Ƚ���� �Է��ϼ���."); // �÷��� Ƚ�� �Է� �ޱ�
	
		int num = a.nextInt();
		a.close();
		if (level.equalsIgnoreCase("beginner")) { // �ʺ��� ������ ���
			Player player = new Player();// player ��ü ����
			player.play(num);// �÷��� Ƚ����ŭ ����
		} else if (level.equalsIgnoreCase("advanced")) { // �߱��� ������ ���
			Player player = new Player(); // player ��ü ����
			AdvancedLevel aLevel = new AdvancedLevel(); // Advanced ���� ��ü ����
			player.upgradeLevel(aLevel); // Advanced ������ ���� ����
			player.play(num); // �÷��� Ƚ����ŭ ����
		} else if (level.equalsIgnoreCase("super")) { // ����� ������ ���
			Player player = new Player(); // player ��ü ����
			SuperLevel bLevel = new SuperLevel(); // Super ���� ��ü ����
			player.upgradeLevel(bLevel); // Super ������ ���� ����
			player.play(num); // �÷��� Ƚ����ŭ ����

		} else { // ���� ó��
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
		}

	}

}
