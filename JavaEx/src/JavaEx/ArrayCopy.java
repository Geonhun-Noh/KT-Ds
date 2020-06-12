package JavaEx;

public class ArrayCopy {
	public static void main(String[] args) {
		double[][] mat1 = {{1,2,3},{2,3,4},{3,4,5}};
		double[][] mat2= new double[mat1.length][mat1[0].length];
		
		System.arraycopy(mat1,0, mat2, 0, mat1.length);
		
		for(int i=0;i<mat1.length;i++) {
			for(int j=0;j<mat1[0].length;j++) {
				System.out.printf("%.6f",mat1[i][j]);
				System.out.print("   ");
			}
			System.out.println();
		}
		System.out.println("----------------------------");
		
		for(int i=0;i<mat2.length;i++) {
			for(int j=0;j<mat2[0].length;j++) {
				System.out.printf("%.6f",mat2[i][j]);
				System.out.print("   ");
			}
			System.out.println();
		}
	}
}
