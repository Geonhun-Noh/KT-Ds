package JavaEx;
/*
 * 거리환산표
 * Distance_Conversion 예제와 동일하지만 2차원 배열을 사용해 표현하기
 */

public class Distance_Conversion2 {
	public static void main(String[] args) {
		String[] Outline = {"","Cm","M","Inch","Feet","Yard","Mile"}; // 행,열 표시값
		double[] Cm = {1, 0.01, 0.3937007874015748, 0.032808398950, 0.010936132983, 0.000006213712}; //1cm 당 몇 단위거리인지
		double[] multi = {1,100,2.54,30.48,91.44,160934.4}; //1단위거리 당 몇 cm인지
		
		String[][] answer = new String[Cm.length+1][multi.length+1];
		
		for(int x=0;x<answer.length;x++) {
			for(int y=0;y<answer[0].length;y++) {
				if(x==0) {
					answer[x][y]=Outline[y];
				}
				else if(y==0) {
					answer[x][y]=Outline[x];
				}
				else {
					String result = String.format("%.7f", multi[x-1] * Cm[y-1]); 
					answer[x][y]= result;
				}
			}
		}
		
		for(int i=0;i<answer.length;i++) {
			for(int j=0;j<answer[0].length;j++) {
				System.out.print(answer[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		
	}
}
