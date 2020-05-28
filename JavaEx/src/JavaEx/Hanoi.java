package JavaEx;

import java.util.*;

public class Hanoi {
	private int tray = 3;
	private int bar = 3;
	int[][] rings;

	public Hanoi(int tray) {
		this.tray = tray;
		rings = new int[tray][bar];
		int cnt=1;
		for (int i = 0; i < rings.length; i++) {
			rings[i][0]=cnt;
			cnt++;
		}

	}

	public int[][] getRings() {
		return rings;
	}

	// 접시 수, 막대 이름 3개를 입력받는다.
	public void moveHanoi(int tray, String start, String target, String other) {
		int cnt = 0; // 총 이동 횟수를 카운트하는 변수
		if (tray == 1) {// 접시가 1장 일때에는 한 번 이동하는 횟수만 세어주고 리턴해준다.
			System.out.println(start + " bar쪽에 있던 링이 " + target + " bar쪽으로 이동");
			cnt++;
		} else { // 접시가 2장 이상일 때에는 재귀함수를 통해 리턴해준다.
			moveHanoi(tray-1,start,other,target);
			System.out.println(start + " bar쪽에 있던 링이 " + target + " bar쪽으로 이동");
			moveHanoi(tray-1,other,target,start);
		}

	}

	

}
