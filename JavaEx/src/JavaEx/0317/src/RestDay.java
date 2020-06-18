import java.util.*;
import java.text.SimpleDateFormat;

public class RestDay {

	// �����, �Ͽ��� ���� Ȯ��
	public static boolean isRest(Calendar tod) {
		boolean isRest = false;
		if (tod.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || tod.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
			isRest = true;
		}
		return isRest;
	}

	// Calendar�� ���ڿ��� ��ȯ
	public static String toYMD(Calendar dd) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(dd.getTime());
	}

	public static void main(String[] args) {
		System.out.println("�޹����� Ȯ���ϼ���!");
		Scanner input = new Scanner(System.in);

		System.out.print("�⵵ : ");
		int year = input.nextInt();

		System.out.print("�� : ");
		int month = input.nextInt();

		System.out.print("�� : ");
		int day = input.nextInt();

		input.close();

		Calendar cal = Calendar.getInstance(); // ������ ������ ����� Calendar ����
		cal.set(year, month, day);

		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // �� ���� ������ ���� ����
		for (int i = 1; i <= lastDay; i++) {
			cal.set(Calendar.DAY_OF_MONTH, i); // 1�Ϻ��� ������������
			if (isRest(cal)) { // ����(��,��) Ȯ��
				System.out.println(toYMD(cal) + "�� �����Դϴ�.");
			}
		}
	}

}
