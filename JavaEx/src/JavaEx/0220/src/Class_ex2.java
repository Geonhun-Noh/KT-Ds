/*
 * 2020.02.20
 * �����
 * Class �ǽ� ����
 */
public class Class_ex2 {
	int age = 50;
	String name = "����";
	boolean marry = true;
	int child = 4;
	
	
public static void main(String[] args) {
		Class_ex2 hy = new Class_ex2();//��ü ����
		Class_ex2 kh = new Class_ex2();
		
		hy.age=24;
		hy.marry=false;
		
		kh.age=27;
		kh.child=0;
		
		System.out.println(hy.age);
		System.out.println(hy.name);
		System.out.println(hy.marry);
		System.out.println(hy.child);
		
		System.out.println(kh.age);
		System.out.println(kh.name);
		System.out.println(kh.marry);
		System.out.println(kh.child);
		
		
}
}
