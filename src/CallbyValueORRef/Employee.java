package CallbyValueORRef;

public class Employee {

	String name;
	int age;
	
	public int Sum(int a,int b) {
		System.out.println("sum of two no.."+a+" : "+b);
		int sum=a+b;
		return sum;
		
	}
	public void getInfo(Employee emp) {
		emp.name="amrita";
		emp.age=25;
	}

}
