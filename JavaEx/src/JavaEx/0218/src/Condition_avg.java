/*
 * 2020.02.18
 * �����
 * ��� �ǽ�����
 */

public class Condition_avg {
	public static void main(String[] args) {
		double avg=95.5;
		String grade = "";
		
		if(avg >= 95) {
			grade = "A+";
		}
		else if(avg >= 90) {
			grade="A";
		}
		else if(avg >= 85) {
			grade="B+";
		}
		else if(avg >= 80) {
			grade="B";
		}
		else if(avg>= 70) {
			grade="C";
		}
		else if(avg>= 60) {
			grade="D";
		}
		else {
			grade="F";
		}
		
		System.out.println(grade);
	}

}
