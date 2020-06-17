import java.io.*;

public class FileInputStreamTest {
	public static void main(String args[]) {
		try(FileInputStream fis = new FileInputStream("input.txt")){
			int i;
			while ((i=fis.read()) != -1) {
				System.out.println((char)i);
			}
			System.out.println("end");
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}