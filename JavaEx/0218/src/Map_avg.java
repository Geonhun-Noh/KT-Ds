/*
 * 2020.02.18
 * 노건훈
 * Map 실습예제
 */


import java.util.Map;
import java.util.HashMap;

public class Map_avg {
	public static void main(String args) {
		Map<String, Integer> scores = new HashMap<String, Integer>();
		scores.put("Math", 90);
		scores.put("Phy", 88);
		scores.put("Eng", 74);
		scores.put("Prog", 100);
		
		double avg = (scores.get("Math")+scores.get("Phy")+scores.get("Eng")+scores.get("Prog"))/4;
		
		System.out.println(scores);
		System.out.println(avg);
	}

}
