package nihar;

class CloningExample implements Cloneable{  

	int rollno;  
	String name;  
	  
	CloningExample(int rollno,String name) throws CloneNotSupportedException{  
		this.rollno=rollno;  
		this.name=name;  
		super.clone();
	}  
	  	  
	public static void main(String args[]){  
		try{  
			CloningExample s1=new CloningExample(101,"amit");  
			CloningExample s2=(CloningExample)s1.clone();  
			  
			System.out.println(s1.rollno+" "+s1.name);  
			System.out.println(s2.rollno+" "+s2.name);  
			  
		}catch(CloneNotSupportedException c){}  
	  
	}  
}  
