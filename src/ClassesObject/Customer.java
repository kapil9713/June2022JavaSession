package ClassesObject;

import java.util.Arrays;

public class Customer {

	public String[] empDetail(String empName) {
		System.out.println("getting emp info"+ empName);
		
		if(empName.equals("Ravi")) {
			String devices[]= {"mac","samsung","mi"};
			return devices;
		}
			
			else if(empName.equals("om")) {
				String devices[]= {"redmi","oppo","vivo"};
				return devices;
			}
				
				else if(empName.equals("Rashmi")) {
					String devices[]= {"realme","infinity","jio"};
					return devices;
		}
				else {
					System.out.println("customer not found");
					return null;
				}
				
		
	}

	public static void main(String[] args) {
		
		Customer cu=new Customer();
		String d[]  = cu.empDetail("Ravi");
		System.out.println(Arrays.toString(d));

	}

}
