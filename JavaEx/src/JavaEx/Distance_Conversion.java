package JavaEx;

public class Distance_Conversion {
	public static void main(String[] args) {
		String[] Outline = {"","Cm","M","Inch","Feet","Yard","Mile"}; // 행,열 표시값
		double[] Cm = {1, 0.01, 0.3937007874015748, 0.032808398950, 0.010936132983, 0.000006213712}; //1cm 당 몇 단위거리인지
		double[] multi = {1,100,2.54,30.48,91.44,160934.4}; //1단위거리 당 몇 cm인지
		
		for(int i=0;i<Outline.length;i++) {
			System.out.print(Outline[i]+"\t\t"); //첫 행 출력(단위 표시)
		}
		System.out.println();
		
		for(int i=0;i<multi.length;i++) {
			System.out.print(Outline[i+1]+"\t"); //첫 열 출력(단위 표시)
			
			for(int j=0;j<Cm.length;j++) {
				System.out.print(String.format("%.7f",multi[i]*Cm[j]));//배열 Cm와 multi 값의 곱으로 단위환산표 도출
				System.out.print("\t");
			}
			System.out.println();
		}
	}


}
