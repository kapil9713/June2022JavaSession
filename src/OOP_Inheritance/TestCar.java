package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {

		BMW b=new BMW();
		b.Start(); //override
		b.Stop(); //inherit
		b.refuel(); //inherit
		b.autoParking(); //individual
		b.billing();
		Car.billing();
		BMW.billing();
		BMW.display();
		b.running();
		b.payment("kapil9713@");
		b.engine();
		
		
		
		System.out.println("------------");
		
		Car c=new Car();
		c.Start();
		c.Stop();
		c.refuel();
		c.payment("naveen@");
		c.engine();
		
		
		System.out.println("___________");
		Audi a=new Audi();
		a.theftSafesty();
		a.refuel();
		
		
		System.out.println("___________");
		
		//Top/up casting
		Car c1 = new BMW();
		c1.Start();
		c1.Stop();
		c1.refuel();
		
		System.out.println("-------------");
		Vehicle v= new BMW();
		v.engine();
		v.petrolEngine();
		//b.petrolEngine();
		//c.petrolEngine();
		b.Start();
		
		
		//down casting
		BMW b1=(BMW) new Car();
		b1.autoParking(); //class cast exception bz practicle not possible downcasting
		
		
		
		
		
	}

}
