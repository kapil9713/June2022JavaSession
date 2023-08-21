package OOP_BuilderPatternTHIS;

public class ConstructorChaining {

	String name;
	int age;
	String city;

	public ConstructorChaining(String name, int age, String city) {
		//this(name, age);
		this.name = name;
		this.age = age;
		this.city = city;
	}
	

	public ConstructorChaining(String name, int age) {
		this("tom", 10, "pune");
//		this.name = name;
//		this.age = age;
	}


	public static void main(String[] args) {
		
		ConstructorChaining cc=new ConstructorChaining("kapil", 25);
		
		System.out.println(cc.name);
		System.out.println(cc.age);
		System.out.println(cc.city);

	}

}
