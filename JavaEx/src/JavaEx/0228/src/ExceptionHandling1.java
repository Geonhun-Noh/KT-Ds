import java.io.*;
import java.net.*;

public class ExceptionHandling1 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a.txt");
		} catch(FileNotFoundException e) {
			System.out.println(e); //����Ŭ������ toString ȣ��
		}
		System.out.println("���⵵ ����˴ϴ�.");
	}

}
//���� ó���� �Ѵٰ� ���α׷��� ���� ��Ȳ ��ü�� ������ ���� ����.
//���� ó���� �ϸ� ���� ��Ȳ�� �˷��ִ� �޽����� ���� ��, ������ ���Ḧ ������ ���� �ִ�.