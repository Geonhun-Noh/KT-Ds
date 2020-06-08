package Collection.HashSet2;

import java.util.*;
import Collection.Student;

public class StudentHashSet {
	private HashSet<Student> hashSet;
	
	public void addStudent(Student student) {
		hashSet.add(student);
	}
	
	public void showAllMember() {
		for(Student student : hashSet) {
			System.out.println(student);
		}
		System.out.println();
	}
	
	public boolean removeMember(int studentID) {
		Iterator<Student> ir = hashSet.iterator();
		while(ir.hasNext()) {
			Student student = ir.next();
			int tempID = student.getStudentID();
			if (tempID == studentID) {
				hashSet.remove(student);
				return true;
			}
		}
		System.out.println(studentID + "가 존재하지 않습니다.");
		return false;
	}
	

}
