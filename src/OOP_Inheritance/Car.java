package OOP_Inheritance;

public class Car extends Vehicle{
	
	public int Start() {
		System.out.println("Car--Start");
		return 100;
	}
	public void Stop() {
		System.out.println("Car--Stop");
	}
	public void refuel() {
		System.out.println("Car--Refuel");
	}
	
	public static void billing() {
		System.out.println("car--billing");
	}
	
	public static void display() {
		System.out.println("car--display");
	}
	public final void running() {
		System.out.println("car--running");
	}
	//method overloading
	
	public void payment(String cc,int cvv) {
		System.out.println("car payment using:"+cc+":"+cvv);
	}
	public void payment(String upi) {
		System.out.println("car payment using:"+upi);
	}

}
