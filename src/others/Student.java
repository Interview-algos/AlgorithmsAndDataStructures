package others;
// An immutable class
public final class Student
{
	final String name;
	final int regNo;

	public Student(String name, int regNo)
	{
		this.name = name;
		this.regNo = regNo;
	}
	public String getName()
	{
		return name;
	}
	public int getRegNo()
	{
		return regNo;
	}
}

// Driver class
class Test
{
	public static void main(String args[])
	{
		Student s = new Student("ABC", 101);
		System.out.println(s.name);
		System.out.println(s.regNo);

		 //Uncommenting below line causes error
		 //s.regNo = 102;
	}
}
