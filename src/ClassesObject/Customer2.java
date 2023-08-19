package ClassesObject;

import java.util.Arrays;

public class Customer2 {
	
	public String[] getEmployeeDevices(String empName) {
		System.out.println("Getting devices info from employee :"+empName);
		
		if(empName.equals("Ravi")) {
			String devices[]= {"iphone","ipad","windows10"};
			return devices;
		}
		else if(empName.equals("om")) {
			String devices[]= {"windows10","redmi","note 8 pro"};
			return devices;
		}
		else if(empName.equals("Kapil")) {
			String devices[]= {"redmi 10","redmi 12 pro","samsung"};
			return devices;
		}
		else if(empName.equals("Rssb")) {
			String devices[]= {"indore","bhopal","dewas"};
			return devices;
		}
		else {
			System.out.println("not found employee list");
		}
		return null;
			
		
	}

	public static void main(String[] args) {

		Customer2 obj=new Customer2();
		String[] employeeDevices = obj.getEmployeeDevices("tom");
		System.out.println(Arrays.toString(employeeDevices));
		
		
		System.out.println(employeeDevices.length);
		
		
		
		
	}

}
