/*
 * 2020.02.18
 * �����
 * Array �ǽ�����
 */
public class Array_avg {
	public static void main(String[] args) {
		int[] scores = new int[4];
		
		int math = 90;
		int phy = 88;
		int eng = 74;
		int prog = 100;
		
		scores[0]=math;
		scores[1]=phy;
		scores[2]=eng;
		scores[3]=prog;
		
		double avg = (scores[0]+scores[1]+scores[2]+scores[3])/4;
		
		System.out.println(scores); //Array�� ����ϸ� ����� ���.
		System.out.println(avg);
		
	}

}
