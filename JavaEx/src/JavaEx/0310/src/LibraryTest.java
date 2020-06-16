import java.util.*;

public class LibraryTest {
	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book("자바",25000));
		bookList.add(new Book("파이썬",15000));
		bookList.add(new Book("안드로이드", 30000));
		
		System.out.println("=== 고객 명단 순서대로 출력 ===");
		bookList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		
		System.out.println("=== 모든 책의 가격의 합 출력 ===");
		int total = bookList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("모든 책의 가격의 합은 "+total+"입니다.");
		
		System.out.println("=== 20000원 이상 책 이름 출력 ===");
		bookList.stream().filter(c->c.getPrice()>=20000).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
	}

}
