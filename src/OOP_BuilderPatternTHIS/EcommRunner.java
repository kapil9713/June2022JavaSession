package OOP_BuilderPatternTHIS;

public class EcommRunner {

	public static void main(String[] args) {

		EcommApplication app =new EcommApplication();
		app.login()
		.login("kapil9713", "kapil7890")
		   .doSearch("macbook pro")
		      .addToCart("macbook pro")
		         .doPayment("1212 3212 4323 1521", "899")
		             .generateOrder()
		                 .logout();
		
		System.out.println("-------------------");
		
		app.login()
		.login("kapil9713", "kapil7890")
		   .doSearch("iphone14", 1500000)
		      .addToCart("iphone14")
		         .doPayment("kapil9713@icici")
		             .generateOrder()
		                 .logout();
	}

}
