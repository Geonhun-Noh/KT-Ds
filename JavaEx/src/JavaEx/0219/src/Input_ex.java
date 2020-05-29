import java.util.*;

public class Input_ex {
	public static void main(String[] args) {
		System.out.println("몇 단을 출력하시겠어요?");
		Scanner input = new Scanner(System.in);

		for (;;) {

			int text = input.nextInt();
			if (text == 0) {
				break;
			} else {
				for (int i = 1; i < 10; i++) {

					System.out.println(text + "*" + i + "=" + (text * i));
				}
				System.out.println("------------------------------------");

			}
		}
	}

}
