import java.io.*;

public class FileCopyTest {
	public static void main(String[] args) {
		long millisecond = 0;
		try(FileInputStream fis = new FileInputStream("a.zip");
				FileOutputStream fos = new FileOutputStream("copy.zip")){
			millisecond = System.currentTimeMillis();
			
			int i;
			while((i=fis.read()) != -1) {
				fos.write(i);
			}
			
			millisecond = System.currentTimeMillis() - millisecond;
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("���� ���� �ϴµ� "+millisecond+"milliseconds �ҿ�Ǿ����ϴ�.");
	}

}
