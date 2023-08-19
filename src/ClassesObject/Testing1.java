package ClassesObject;

public class Testing1 {
	
	public int getStudentName(String studentName) {
		System.out.println("Getting student name :"+studentName);
		int marks=-1;
		
		if(studentName.equals("Ravi")) {
			return marks;
		}
		else if(studentName.equals("Pooja")) {
			return marks;
		}
		else if(studentName.equals("RSSB")) {
			return marks;
		}
		else {
			System.out.println("student not found :"+studentName);
			return -1;
		}
	}

	public static void main(String[] args) {

		
		Testing1 obj=new Testing1();
		int name=obj.getStudentName("Pooja");
		System.out.println(name);
		
		
		
		
		
	}

}
