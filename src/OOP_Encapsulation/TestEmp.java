package OOP_Encapsulation;

public class TestEmp {

	public static void main(String[] args) {

		
		Browser br=new Browser();
		br.launchBrowser();
		
		System.out.println("**********************");
		
		//Employee
		Employee obj=new Employee();
		obj.name="kapil";
		obj.age=30;
		obj.setSalary(12.33);
		System.out.println(obj.getSalary()+" "+obj.name+" "+obj.age);
		
		System.out.println("***************");
		
		//Registration
		
		Registration reg=new Registration("Ravi", 25, "banglore","18-11-90");
		
		System.out.println(reg.getName()+" "+reg.getAge()+" "+reg.getAddress()+" "+reg.getDob());
		
		//change the add banglore to pune
		
		reg.setAddress("pune");
		
		System.out.println(reg.getName()+" "+reg.getAge()+" "+reg.getAddress()+" "+reg.getDob());
		
		System.out.println("**********************");
		//Company 
		Company com=new Company();
		com.setName("kapil");
		String name = com.getName();
		System.out.println(name);
		
//		com.setName("pooja");         //not updating a value but additional value given to name
//		String name2 = com.getName();
//		System.out.println(name2);
		
		com.setEmpCount(10);
		int empCount = com.getEmpCount();
		System.out.println(empCount);
		
		com.setSharePrice(500);
		int sharePrice = com.getSharePrice();
		System.out.println(sharePrice);
		
	}

}
