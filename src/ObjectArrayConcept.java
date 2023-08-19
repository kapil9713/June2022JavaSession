import java.util.Arrays;

public class ObjectArrayConcept {

	public static void main(String[] args) {
		
		Object emp[]=new Object[5];
		
		emp[0]="Kapil";
		emp[1]=25;
		emp[2]=25.55;
		emp[3]='F';
		emp[4]=true;
		
		System.out.println(emp.length);
		
		System.out.println(Arrays.toString(emp));
		
		for(Object e:emp) {
			System.out.println(e);
			
			if(e.equals("Kapil")) {
				System.out.println("Emp of QA");
			}
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
