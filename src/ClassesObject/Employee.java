package ClassesObject;

public class Employee {

	String name;
	int age;
	String city;
	Double salary;

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.name = "Naveen";
		e1.age = 25;
		e1.city = "Pune";
		e1.salary = 12.33;

		System.out.println(e1.name + " " + e1.age + " " + e1.city + " " + e1.salary);

		System.out.println("**********************");

		System.out.println(new Employee().name = "Kapil"); // It is a bad Practice

		System.out.println("*********************");

//		Employee e3 =new Employee();
//		e3=null;
//		e3.name="Naveen";
//		System.out.println(e3.name);

		System.out.println("*****************");

		Employee e2 = new Employee();

		System.out.println(e2.name); //null
		System.out.println(e2.age); //0
		System.out.println(e2.salary); //0.0
		System.out.println(e2.city); //null

	}

}
