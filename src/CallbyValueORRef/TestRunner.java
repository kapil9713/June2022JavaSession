package CallbyValueORRef;

public class TestRunner {

	public static void main(String[] args) {

		Employee e1=new Employee();
		int sum = e1.Sum(10, 20); //calling a method by passing a value
		System.out.println(sum);
		
		
		
		
		System.out.println(e1.name+" "+e1.age);
		
		
		e1.name="kapil";
		e1.age=30;
		System.out.println(e1.name+" "+e1.age);
		
		
		e1.getInfo(e1); //call by ref
		
		System.out.println(e1.name+" "+e1.age);
		
	}

}
