package OOP_Constructor;

public class Employee {
	
	public Employee() {
		System.out.println("default const...");
	}
	
	public Employee(int a) {
		System.out.println("1 param const..."+a);
	}
	public Employee(int a  ,int b) {
		System.out.println("2 param const..."+(a+b));
	}

	public static void main(String[] args) {

		Employee e1=new Employee();
		Employee e2=new Employee(10);
		Employee e3=new Employee(10, 20);
		
		
		
		
	}

}
