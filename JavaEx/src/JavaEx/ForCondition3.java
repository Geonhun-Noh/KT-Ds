package JavaEx;
import java.util.*;

public class ForCondition3 {
	public static void main(String[] args) {
		List<Integer> ilist = new ArrayList<>();
		int s =0;
		for(int i=1;i<100;i++) {
			ilist.add(i);
		}
		
		//filter는 조건이라 생각하면 된다. 걸러줌.
		//reduce는 ()에 있는 내용을 실행. filter().reduce(0,x*y)일 경우, 계산 초기값을 0으로 지정.그 후 조건에 맞는 x,y를 곱함.
		s=ilist.stream().reduce(0, Integer::sum);
		System.out.println("1~100의 합 : "+s);
		s=0;
		s=ilist.stream().filter(i->i%2==1).reduce(0, Integer::sum);
		System.out.println("1~100사이의 홀수의 합 : "+s);
		s=ilist.stream().filter(i->i%2==1).reduce(0,(x,y)->x+y);
		System.out.println("1~100사이의 홀수의 합 : "+s);
	}

}
