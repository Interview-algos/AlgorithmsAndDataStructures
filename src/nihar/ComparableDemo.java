package nihar;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Object>{
	
	String name;
	int age;
	long rollno;
	
	public Student(String name, int age, int rollno){
		this.name = name;
		this.age = age;
		this.rollno = rollno;		
	}

	@Override
	public int compareTo(Object obj) {
		
		Student student1 = (Student)obj;
		
		if (this.age == student1.age)
			return 0;
		else if (this.age > student1.age)
			return 1;
		else 
			return -1;
	
	}	
	
}

public class ComparableDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 = new Student("Nihar", 34, 272737);
		Student student2 = new Student("Pinki",26, 283888);
		Student student3 = new Student("Jathin", 2, 292828);
		
		ArrayList<Student> alist = new ArrayList<Student>();
		alist.add(student1);
		alist.add(student2);
		alist.add(student3);
		
		Collections.sort(alist);
		
		for (Student student : alist) {
			
			System.out.println("Name " + student.name + " Age " + student.age + " rollno " + student.rollno);
			
		}
		
		
	}

}
