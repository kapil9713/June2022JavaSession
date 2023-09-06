package OOP_Interface;

public class Fortis extends Hospital implements UsMedical, UkMedical, indianMedical,WHO {

	@Override
	public void cardioServices() {
		System.out.println("US-cardioServices");
	}

	@Override
	public void neuroServices() {
		System.out.println("US-neuroServices");
	}

	@Override
	public void physioServices() {
		System.out.println("US-physioServices");
	}

	@Override
	public void oncologyServices() {
		System.out.println("IM-oncologyServices");
	}

	@Override
	public void gynicServices() {
		System.out.println("IM-gynicServices");
	}

	@Override
	public void orthoServices() {
		System.out.println("IM-orthoServices");

	}

	@Override
	public void entServices() {
		System.out.println("UK-entServices");

	}

	@Override
	public void dentalServices() {
		System.out.println("UK-dentalServices");

	}

	// common
	@Override
	public void emergencyServices() {
		System.out.println("Common-emergencyServices");

	}

	//individual
	public void medicalTraning() {
		System.out.println("medicalTraning");

	}

	//individual
	public void medicalInsurance() {
		System.out.println("medicalInsurance");

	}

	@Override
	public void covidVaccination() {
		System.out.println("WHO-covidVaccination");

		
		
	}

	@Override
	public void pandemicNews() {

		
		
	}

}
