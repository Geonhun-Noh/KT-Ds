package JavaEx;
import java.util.*;


public class StackEx {
	public static void main(String[] args) {
		Stack st = new Stack();
		
		st.push(1);
		st.push(2);
		st.push(3);
		
		while (!st.empty()){
			System.out.println(st);
			System.out.println(st.pop());
		}
	}

}
