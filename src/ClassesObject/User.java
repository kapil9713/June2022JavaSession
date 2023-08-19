package ClassesObject;

public class User {
	
	String name;
	int age;
	String city;
	
	
	//Returns sum of two numbers
	
	public int sum(int a,int b) {
		int sum=a+b;
		return sum;
	}

	public static void main(String[] args) {
		
		User u1=new User();
		u1.name="Naveen";
		u1.age=25;
		u1.city="Pune";
		
		
		User u2 =new User();
		u2.name="Kapil";
		u2.age=30;
		u2.city="LA";
		
		u1=u2;
		
		User u3= new User();
		u3.name="Babli";
		u3.age=27;
		u3.city="NY";
		
		u2=u3;
		u1=u2=u3;
		
		System.out.println(u1.name+""+u1.age+""+u1.city);
		System.out.println(u2.name+""+u2.age+""+u2.city);
		System.out.println(u3.name+""+u3.age+""+u3.city);
		
		int sum=u1.sum(10, 20);
		System.out.println(sum);
		
		
		
		
		
		
		
		
		

	}

}
