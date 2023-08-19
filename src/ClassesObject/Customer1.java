package ClassesObject;

import java.util.Arrays;

public class Customer1 {

	public String[] customerDetail(String custName) {
		
		
		
		System.out.println("getting customer detail");
		
		if (custName.equals("Kapil")) {
			
			String device[]= {"iphone","mi"};

		}
		else if(custName.equals("pooja")) {
			String device[]= {"zen","realme"};
		}
		else {
			System.out.println("customer not found");
		}
		return null;
		
	}

	public static void main(String[] args) {
		
		Customer1 cs=new Customer1();
		String d[] = cs.customerDetail("Kapil");
		System.out.println(Arrays.toString(d));

	}

}
