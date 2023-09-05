package OOP_Inheritance;

public class BMW extends Car{
	
	@Override
	public int Start() {
		System.out.println("BMW--Start");
		return 100;
	}
	public void autoParking() {
		System.out.println("autoParking");
	}
	
	public static void billing() {
		System.out.println("bmw--billing");
	}
	
	public static void display() {
		System.out.println("car--display");
	}
	
	public void payment(String cc,int cvv) {
		System.out.println("bmw payment using:"+cc+":"+cvv);
	}
	
	public void payment(String upi) {
		System.out.println("bmw payment using:"+upi);
	}
	@Override
	public void engine() {
		System.out.println("bmw engine :");
	}
	

}
