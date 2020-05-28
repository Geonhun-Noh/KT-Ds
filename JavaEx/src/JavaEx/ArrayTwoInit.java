package JavaEx;

import java.util.Arrays;

public class ArrayTwoInit {
	public static void main(String[] args) {
		System.out.println("//2차원 배열 방법1" );
		
		int [][] a= new int[4][3];
		a[0][0] = 1;
		a[0][1] = 1;
		a[0][2] = 1;
		a[1][0] = 1;
		a[1][1] = 1;
		a[1][2] = 1;
		a[2][0] = 1;
		a[2][1] = 1;
		a[2][2] = 1;
		a[3][0] = 1;
		a[3][1] = 1;
		a[3][2] = 1;
		
		for(int i =0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print("["+a[i][j]+"]");
				System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("//2차원 배열 방법2 (JigJagged도 가능)");
		int[][] b = new int[3][5];
	      b[0]= new int [4];
	      b[2]= new int [3];
	      
	      for(int i =0 ; i<b.length ; i++) {
	         for(int j =0 ; j<b[i].length; j++) {
	        	 System.out.print("["+b[i][j]+"]");
					System.out.print(" ");
	         }
	         System.out.println();
	      }
		
		
		
		
		System.out.println("//2차원 배열 방법3");
		
		int [][] k= new int[3][5];
		for(int i=0;i<k.length;i++) {
			int n=(int)(Math.random()*10);
			for(int j=0;j<k[i].length;j++) {
				if(n>=10) {
					n=n-10;
				}
				k[i][j]=n;
				n=n+1;
				System.out.print("["+k[i][j]+"]");
				System.out.print(" ");
			}
			System.out.println();
			
		}
		
		
		System.out.println("copy 1");
		int[][] copy=Arrays.copyOf(k,6);
		for(int i =0;i<copy.length;i++) {
			for(int j=0;j<copy[i].length;j++) {
				System.out.print("["+copy[i][j]+"]");
				System.out.print(" ");
			}
			System.out.println();
		}
		
		
	}

}
