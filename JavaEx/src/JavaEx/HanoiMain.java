package JavaEx;

import java.util.Scanner;

public class HanoiMain {// 메인 메소드
		public static void main(String[] args) {
			System.out.println("접시의 수를 입력하세요");
			Scanner input = new Scanner(System.in);
			int tray = input.nextInt();
			input.close();

			Hanoi ht = new Hanoi(tray);
			int[][] a = ht.getRings();
			HanoiUtil.showHanoi(a);
			HanoiUtil.moveHanoi(a,tray,"a","b","c");
			//System.out.println(ht.moveHanoi(tray, "A", "B", "C") + "회 이동");
		}


}
