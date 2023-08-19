package OOP_Constructor;

public class User {
	
	String name;
	int age;
	String email;
	String password;
	String phone;
	
	public User(String name, int age, String email, String password) {
		
		this.name = name;
		this.age = age;
		this.email = email;
		this.password = password;
	}

	
	
	public User() {
		System.out.println("default const..");
	}
	
	public User(String name,int age) {
		this.name=name;
		this.age=age;
		
	}
	public User(String name,int age,String email) {
		this.name=name;
		this.age=age;
		this.email=email; 
		
	}

	public static void main(String[] args) {

		User u1=new User("tom",25);
		System.out.println(u1.name);
		System.out.println(u1.age);
		
		
		User u2=new User("lisa", 20, "lisa@gmail.com");
		System.out.println(u2.name);
		System.out.println(u2.age);
		System.out.println(u2.email);
		
		User u3=new User("kapil", 10, "kapil9713@", "7890");
		System.out.println(u3.name);
		System.out.println(u3.age);
		System.out.println(u3.email);
		System.out.println(u3.password);
		
		
		
	}

}
