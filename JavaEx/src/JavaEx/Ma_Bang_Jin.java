/*
 * 홀수 마방진 만들기
 */
package JavaEx;

import java.util.*;

public class Ma_Bang_Jin {
	public static void main(String[] args) {
		System.out.println("홀수 정수를 입력하세요.");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.close();

		
		int[][] mabang = new int[num][num];
		int col = num / 2;
		int row = 0;
		int start = 1;
		mabang[row][col] = start;
		int check = 0;

		while (true) {
			row = row - 1;
			col = col - 1;

			// 벽 넘을 때 row, col 설정
			if (row == -1) {
				row = mabang.length - 1;
			}
			if (col == -1) {
				col = mabang.length - 1;
			}

			// 기존값이 있는 경우
			if (mabang[row][col] > 0) {
				row = row + 2;
				col = col + 1;
				if (row >= num) {
					row = row - num;
				}
				if (col >= num) {
					col = col - num;
				}

				check = check + 1;

				if (check == num) {
					System.out.println("완료!");
					break;
				}
			}

			// 인덱스에 넣기
			start = start + 1;
			mabang[row][col] = start;
		}

		for (int i = 0; i < mabang.length; i++) {
			for (int j = 0; j < mabang[i].length; j++) {
				System.out.printf("%3d", mabang[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
