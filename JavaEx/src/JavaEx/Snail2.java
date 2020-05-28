package JavaEx;

import java.util.Scanner;

public class Snail2 {
	private int m;
	private int n;
	public int[][] snail;

	public Snail2(int m, int n) {
		this.m = m;
		this.n = n;
		this.snail = new int[m][n];
	}

	public void make() {
		int dir = 0; // 방향; 아래:0, 오른쪽:1, 위:2, 왼쪽:3
		int val = 1; // 값; 한칸 이동 시 마다 1 증가
		int x = 0; // 위,아래 인덱스 좌표
		int y = 0; // 좌,우 인덱스 좌표
		snail[x][y] = val;// 초기값 (0,0)에 값 1 대입

		while (val < m * n) { // 배열에 들어갈 수 있는 최대값을 넘을 경우 break

			if (dir == 0) { // 아래쪽으로 이동
				x++;
				if (x > m - 1 || snail[x][y] > 0) {// 값이 있거나, 최대 인덱스를 넘을 경우 방향을 바꿈
					x--; // 다시 이전 좌표로 복귀
					dir++;
				} else {
					val++;
					snail[x][y] = val;
				}

			}

			else if (dir == 1) { // 오른쪽으로 이동
				y++;
				if (y > n - 1 || snail[x][y] > 0) {
					y--; // 다시 이전 좌표로 복귀
					dir++;
				} else {
					val++;
					snail[x][y] = val;
				}

			}

			else if (dir == 2) { // 위으로 이동
				x--;
				if (x < 0 || snail[x][y] > 0) {// 값이 있거나, 최소 인덱스를 넘을 경우 방향을 바꿈
					x++; // 다시 이전 좌표로 복귀
					dir++;
				} else {
					val++;
					snail[x][y] = val;
				}

			} else { // 왼쪽으로 이동
				y--;
				if (y < 0 || snail[x][y] > 0) {
					y++; // 다시 이전 좌표로 복귀
					dir = 0; // 방향을 바꿀 경우, 다시 아래쪽으로
				} else {
					val++;
					snail[x][y] = val;
				}
			}

		}

	}

	public void print() { // 배열 값 전체를 출력하는 메소드
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("(%3d)", snail[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("행 : ");
		int row = input.nextInt();
		System.out.print("열 : ");
		int col = input.nextInt();
		input.close();

		Snail2 snail = new Snail2(row, col);
		snail.make();
		snail.print();
	}
}
