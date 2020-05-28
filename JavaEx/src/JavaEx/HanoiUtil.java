package JavaEx;

public class HanoiUtil {
	public static void moveHanoi(int[][] a, int tray, String ringA, String ringB, String ringC) {
		if(tray==1) {
			showHanoi(a,ringA,ringB);
		}else {
			moveHanoi(a,tray-1,ringA,ringC,ringB);
			showHanoi(a,ringA,ringB);
			moveHanoi(a,tray-1,ringC,ringB,ringA);
		}
	}
	
	// ringA에서 ringB로 이동하는 과정을 표현한다.
		public static void showHanoi(int[][] a, String ringA, String ringB) {
			int aa = 0;
			int ab = 1;

			switch (ringA) {
			case "a":
				aa = 0;
				break;
			case "b":
				aa = 1;
				break;
			case "c":
				aa = 2;
				break;
			}

			switch (ringB) {
			case "a":
				ab = 0;
				break;
			case "b":
				ab = 1;
				break;
			case "c":
				ab = 2;
				break;
			}

			// 접시를 어느 막대에서 어느 막대로 이동했는지 출력
			System.out.println(ringA + " bar쪽에 있던 링이 " + ringB + " bar쪽으로 이동");

			puts(a, aa, ab);
			showHanoi(a);
		}

		public static void showHanoi(int[][] a) {
			for (int i = 0; i < a.length; i++) {
				System.out.print("[\t");
				for (int j = 0; j < a[0].length; j++) {
					System.out.print(a[i][j] + "\t");
				}
				System.out.println("]");
			}
			System.out.println("====================================");
		}

		// 접시를 옮길 때, 이미 다른 접시가 놓여있다면 그 위로 올리는 과정이 필요하므로 해당 인덱스를 찾아내는 메소드
		public static int hasTray(int[][] a, int bar) {
			int no = -1;
			for (int i = 0; i < a.length; i++) {
				if (a[i][bar] != 0) {
					no = i;
					break;
				}
			}
			return no;
		}

		public static void change(int[][] a, int aa, int ab, int ba, int bb) {
			System.out.println("(" + aa + ", " + ab + ") ==> (" + ba + ", " + bb + ") :");
			a[ba][bb] = a[aa][ab];
			a[aa][ab] = 0;
		}

		public static void puts(int[][] a, int barA, int barB) {
			if (hasTray(a, barA) != -1) {
				if(hasTray(a,barB)!=-1) {
				change(a, hasTray(a, barA), barA, hasTray(a, barB) - 1, barB);
			} else {
				change(a, hasTray(a, barA), barA, a.length - 1, barB);
			}
			}
		}

}
