/*
 * 2020.02.18
 * 노건훈
 * List 실습예제
 */


import java.util.ArrayList;
import java.util.List;

public class List_avg {
	public static void main(String[] args) {
		List<Integer> scores = new ArrayList<Integer>();
		
		int math = 90;
		int phy = 88;
		int eng = 74;
		int prog = 100;
		
		scores.add(math);
		scores.add(phy);
		scores.add(eng);
		scores.add(prog);
		
		double avg = (scores.get(0)+scores.get(1)+scores.get(2)+scores.get(3))/4;
		
		System.out.println(scores);
		System.out.println(avg);
	}

	
}

