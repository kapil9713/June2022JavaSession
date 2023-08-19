package OOP_Encapsulation;

public class TestEmp {

	public static void main(String[] args) {

		
		Browser br=new Browser();
		br.launchBrowser();
		
		System.out.println("**********************");
		
		Employee obj=new Employee();
		obj.name="kapil";
		obj.age=30;
		obj.setSalary(12.33);
		System.out.println(obj.getSalary()+" "+obj.name+" "+obj.age);
		
		
		
	}

}
