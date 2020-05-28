package JavaEx;

public class JSort {
	public static void print(int []n) {
		for(int i=0;i<n.length;i++) {
			System.out.print(n[i]+" ");
		}
		System.out.println();
	}
	
	public static void BubbleSort(int[] n) {
		int dum;
		for(int count=0;count<n.length;count++) {//소트 횟수
			for(int index=0;index<n.length-count-1;index++) {//인덱스(1회일 때는 마지막 인덱스까지, 2회일 때는 마지막에서 두번째까지, ..., 마지막엔 1,2번 인덱스만 비교)
				if(n[index]>n[index+1]) {
					dum=n[index];
					n[index]=n[index+1];
					n[index+1]=dum;
					}
				}
			}
		}
	
}
