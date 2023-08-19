package OOP_Constructor;

public class CarTest {

	public static void main(String[] args) {

		Car c1=new Car("audi");
		Car c2=new Car("bmw", "black");
		Car c3=new Car("honda" ,10,false);
		
		System.out.println(c1.name+" "+c1.color+" "+c1.price+" "+c1.isAutomatic);
		System.out.println(c2.name+" "+c2.color+" "+c2.price+" "+c2.isAutomatic);
		System.out.println(c3.name+" "+c3.color+" "+c3.price+" "+c3.isAutomatic);
		
		
	}

}
