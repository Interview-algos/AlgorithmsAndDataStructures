package others;

public class SingletonDemo {

	private static SingletonDemo obj = null;
	String name = null;
	int age;
	
	private SingletonDemo(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}	
		
	public static SingletonDemo getInstance(){
		
		if (obj == null)
			obj = new SingletonDemo();
		return obj;
	
	}
	
	public static void main(String[] args) {
		
		SingletonDemo obj1 = SingletonDemo.getInstance();
		obj1.setName("Nihar");
		obj1.setAge(35);
		
		SingletonDemo obj2 = SingletonDemo.getInstance();
		System.out.println("Obj2 Age is " + obj2.getAge());
		
		obj2.setAge(32);
		
		System.out.println("Obj1 Age is " + obj1.getAge());
		

	}

}
