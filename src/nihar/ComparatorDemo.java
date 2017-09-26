package nihar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student1{
	
	String name;
	int age;
	int rollno;
	
	public Student1(String name, int age, int rollno){
		this.name = name;
		this.age = age;
		this.rollno = rollno;
	}
}

class AgeComparator implements Comparator<Object>{
	
	public int compare(Object obj1, Object obj2){
		Student1 s1 = (Student1)obj1;
		Student1 s2 = (Student1)obj2;
		
		if (s1.age == s2.age)
			return 0;
		else if (s1.age > s2.age)
			return 1;
		else
			return -1;
		
	}
	
}

class NameComparator implements Comparator<Object>{
	
	public int compare(Object obj1, Object obj2){
		Student1 s1 = (Student1)obj1;
		Student1 s2 = (Student1)obj2;
		
		return s1.name.compareTo(s2.name);
		
	}
	
}

public class ComparatorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student1 student1 = new Student1("Nihar", 34, 272737);
		Student1 student2 = new Student1("Pinki",29, 283888);
		Student1 student3 = new Student1("Jathin", 1, 282828);
		
		AgeComparator agecomparator = new AgeComparator();
		
		ArrayList<Student1> alist = new ArrayList<Student1>();
		alist.add(student1);
		alist.add(student2);
		alist.add(student3);
		
		Collections.sort(alist, agecomparator);
		
		for (Student1 student : alist) {
			
			System.out.println(student.name + " " + student.age + " " + student.rollno);
			
		}
		
		System.out.println("===============");
		
		Collections.sort(alist, new NameComparator());
		
		for (Student1 student : alist) {
			
			System.out.println(student.name + " " + student.age + " " + student.rollno);
			
		}
		

	}

}
