//람다 표현식을 통해서 인터페이스를 직관적으로 설정할 수 있다.

public class TestStringConcat {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		
		StringConcat concat2 = (s,v) -> System.out.println(s+", "+v);
		concat2.makeString(s1, s2);
	}

}
