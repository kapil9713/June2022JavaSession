package ClassesObject;

public class Testing {
	
	public int getStudentName(String studentName) {
		System.out.println("Getting student marks :"+studentName);
		
		if(studentName.equals("Ravi")) {
			return 100;
		}
		else if(studentName.equals("Pooja")) {
			return 90;
		}
		else if(studentName.equals("Yashraj")) {
			return 80;
		}
		else if(studentName.equals("Naveen")) {
			return 80;
		}
		else {
			System.out.println("student not found :"+studentName);
			return -1;
		}
	}

	public static void main(String[] args) {

		Testing obj=new Testing();
		int name = obj.getStudentName("Kapil");
		System.out.println(name);
		
		
		
		
		
		
		
	}

}
