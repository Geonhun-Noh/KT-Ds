import java.util.Scanner;

public class SortTest {
	public static void main(String[] args) {
		System.out.println("정렬 방식을 선택해주세요.");
		System.out.println("오름차순:A, 내림차순:D");
		Scanner input = new Scanner(System.in);
		String choiceSort = input.next();
		System.out.println("정렬 과정을 선택해주세요.");
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
				System.out.println("잘못입력하였습니다.");
			}
		} else if (selectSort == 'H' || selectSort == 'h') {
			sort = new HeapSort();
			if (choiceSort.equalsIgnoreCase("A")) {
				sort.ascending(arr);
			} else if (choiceSort.equalsIgnoreCase("D")) {
				sort.descending(arr);
			} else {
				System.out.println("잘못입력하였습니다.");
			}
		} else if (selectSort == 'B' || selectSort == 'b') {
			sort = new BubbleSort();
			if (choiceSort.equalsIgnoreCase("A")) {
				sort.ascending(arr);
			} else if (choiceSort.equalsIgnoreCase("D")) {
				sort.descending(arr);
			} else {
				System.out.println("잘못입력하였습니다.");
			}

		} else {
			System.out.println("잘못입력하였습니다.");
		}

	}
}
