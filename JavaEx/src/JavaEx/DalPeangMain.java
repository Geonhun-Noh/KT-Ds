package JavaEx;
import java.util.*;

public class DalPeangMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("행 : ");
		int row = input.nextInt();
		System.out.print("열 : ");
		int col = input.nextInt();
		input.close();
		
		Dal_Peang_Yee snail = new Dal_Peang_Yee(row,col);
		snail.make();
		snail.print();
	}

}
