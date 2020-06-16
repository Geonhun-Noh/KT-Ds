import java.io.*;

public class ThrowException {
	public Class loadClass(String filename, String className) throws FileNotFoundException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream(filename);//FileNotFoundException �߻�
		Class c = Class.forName(className); //ClassNotFooundException �߻�
		return c;
	}
	
	public static void main(String[] args) {
		ThrowException test = new ThrowException();
		try{
			test.loadClass("a.txt","java.lang.String");	
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
