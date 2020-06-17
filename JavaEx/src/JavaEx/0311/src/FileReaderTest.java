import java.io.*;

public class FileReaderTest {
	public static void main(String[] args) {
		try(FileReader fr = new FileReader("writer.txt")){
			int i;
			while((i=fr.read()) != -1) {
				System.out.println((char)i);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
