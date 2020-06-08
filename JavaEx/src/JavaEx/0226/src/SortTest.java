import java.util.Scanner;

public class SortTest {
	public static void main(String[] args) {
		System.out.println("���� ����� �������ּ���.");
		System.out.println("��������:A, ��������:D");
		Scanner input = new Scanner(System.in);
		String choiceSort = input.next();
		System.out.println("���� ������ �������ּ���.");
		System.out.println("QuickSort:Q, HeapSort:H, BubbleSort:B");
		String select = input.next();
		input.close();
		char selectSort = select.charAt(0);
		Sort sort = null;

		int[] arr = null;

		if (selectSort == 'Q' || selectSort == 'q') {
			sort = new QuickSort();
			if (choiceSort.equalsIgnoreCase("A")) {
				sort.ascending(arr);
			} else if (choiceSort.equalsIgnoreCase("D")) {
				sort.descending(arr);
			} else {
				System.out.println("�߸��Է��Ͽ����ϴ�.");
			}
		} else if (selectSort == 'H' || selectSort == 'h') {
			sort = new HeapSort();
			if (choiceSort.equalsIgnoreCase("A")) {
				sort.ascending(arr);
			} else if (choiceSort.equalsIgnoreCase("D")) {
				sort.descending(arr);
			} else {
				System.out.println("�߸��Է��Ͽ����ϴ�.");
			}
		} else if (selectSort == 'B' || selectSort == 'b') {
			sort = new BubbleSort();
			if (choiceSort.equalsIgnoreCase("A")) {
				sort.ascending(arr);
			} else if (choiceSort.equalsIgnoreCase("D")) {
				sort.descending(arr);
			} else {
				System.out.println("�߸��Է��Ͽ����ϴ�.");
			}

		} else {
			System.out.println("�߸��Է��Ͽ����ϴ�.");
		}

	}
}
