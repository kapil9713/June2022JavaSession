package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {

		Fortis fh=new Fortis();
		//US medical
		fh.cardioServices();
		fh.neuroServices();
		fh.physioServices();
		
		System.out.println("___________");
		
		//UK medical
		fh.entServices();
		fh.dentalServices();
		System.out.println("___________");
		
		//Indian medical
		fh.oncologyServices();
		fh.gynicServices();
		fh.orthoServices();
		System.out.println("___________");
		
		//common
		fh.emergencyServices();
		System.out.println("___________");
		
		//individual
		fh.medicalInsurance();
		fh.medicalTraning();
		System.out.println("______________");
		
		//top casting 
		UsMedical us=new Fortis();
		us.cardioServices();
		us.neuroServices();
		us.physioServices();
		System.out.println("____________");
		//top casting
		UkMedical uk= new  Fortis();
		uk.dentalServices();
		uk.entServices();
		
		System.out.println("__________");
		
		//top casting 
		indianMedical im= new  Fortis();
		im.oncologyServices();
		im.gynicServices();
		im.orthoServices();
		
		System.out.println("____________");
		//Hospital class
		fh.medicalRD();
		fh.medicalNews();
		System.out.println("___________");
		
		//WHO
		fh.covidVaccination();
		
		
	}

}
