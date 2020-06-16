import java.util.*;

public class LibraryTest {
	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book("�ڹ�",25000));
		bookList.add(new Book("���̽�",15000));
		bookList.add(new Book("�ȵ���̵�", 30000));
		
		System.out.println("=== �� ��� ������� ��� ===");
		bookList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		
		System.out.println("=== ��� å�� ������ �� ��� ===");
		int total = bookList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("��� å�� ������ ���� "+total+"�Դϴ�.");
		
		System.out.println("=== 20000�� �̻� å �̸� ��� ===");
		bookList.stream().filter(c->c.getPrice()>=20000).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
	}

}
