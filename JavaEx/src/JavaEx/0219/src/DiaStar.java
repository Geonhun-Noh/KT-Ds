/*
 * 2020.02.19
 * �����
 * ���̾Ƹ�� ��Ÿ
 */
public class DiaStar {
	public static void main(String[] args) {
		

		for(int i=0;i<5;i++) {
			if(i<=3) {
				for(int j=0;j<(6-2*i)/2;j++) {
			
				System.out.print(' ');   
				}
				for(int j=0;j<2*i-1;j++) {
				System.out.print('*');
				}
			}
			
			else {
				for(int j=0;j<(2*i-6)/2;j++) {
					
					System.out.print(' ');
					}
					for(int j=0;j<11-2*i;j++) {
					System.out.print('*');
					}
			}
			
			System.out.println();
	}
}
}
