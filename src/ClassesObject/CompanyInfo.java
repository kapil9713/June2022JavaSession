package ClassesObject;

public class CompanyInfo {

	String ComName;
	int gst;
	String empName;
	String name;

	public String comName(String comName) {
		return comName;

	}
	public void gst(int gst) {
		System.out.println("");
	}

	public static void main(String[] args) {

		CompanyInfo ci = new CompanyInfo();

		String comName = ci.comName("IBM");
		System.out.println(comName);

	}

}
