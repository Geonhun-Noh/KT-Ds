/*
 * Array List Map
 * 2020.02.18
 * �����
 */


import java.util.ArrayList;
import java.util.List;

public class Array_List_Map {
	public static void main(String[] args) {
		List<Integer> scores = new ArrayList<Integer>();
		scores.add(100);
		scores.add(90);
		scores.add(97);
		scores.add(93);
		
		//remove�� �ε����� �����԰� ���ÿ� ������ ����Ʈ�� �ε����� ��迭�ȴ�.
		//scores.remove(0);
		scores.remove(1);
		scores.remove(2);
		//scores.remove(3);
		
		System.out.println(scores); 
	}

}


