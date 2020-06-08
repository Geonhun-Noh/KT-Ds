package Collection.HashSet2;

import java.util.HashSet;

import Collection.Student;

public class StudentTest {
	public static void main(String[] args) {
		HashSet<Student> set = new HashSet<Student>();
		
		set.add(new Student(100,"차은재"));
		set.add(new Student(200,"서우진"));
		set.add(new Student(300,"박은탁"));
		set.add(new Student(100,"윤아름"));
		
		System.out.println(set);
	}

}
