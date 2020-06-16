import java.io.*;

public class ExceptionHandling2 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a.txt");
		} catch(FileNotFoundException e) {
			System.out.println(e);
			return; 
			// return�� ����ʿ� ���� ���α׷��� ���� ����, Finally�� �����.
			// ���� return�� ������ �Ʒ��� "���⵵ ����˴ϴ�."�� ��µȴ�.
		} finally { //�׻� ����Ǵ� �κ�
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("�׻� ���� �˴ϴ�.");
		}
		System.out.println("���⵵ ����˴ϴ�.");//�� �ȵ��ư���? -> finally �ٱ��̶� �ȵ��ư�.
	}

}
//���� �߻� ���ο� ������� �������� �ݵ�� ����Ǿ�� �ϴ� �ڵ�� finally�� ����Ѵ�.
//try����� ����Ǹ� finally ����� � ��쿡�� �ݵ�� ����ȴ�.