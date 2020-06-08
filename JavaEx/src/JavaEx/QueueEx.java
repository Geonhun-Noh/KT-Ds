package JavaEx;
import java.util.*;

public class QueueEx {
	public static void main(String[] args) {
		Queue qu = new LinkedList();
		
		qu.offer(1);
		qu.offer(2);
		qu.offer(3);
		
		while(! qu.isEmpty()) {
			System.out.println(qu);
			System.out.println(qu.poll());
		}
	}

}
