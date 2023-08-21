package OOP_BuilderPatternTHIS;

public class EcommApplication {

	public EcommApplication login() {
		System.out.println("login to the application : ");
		return this;

	}

	public EcommApplication login(String un, String password) {
		System.out.println("username :"+un+":"+"password :"+password);
		return this;

	}

	public EcommApplication doSearch(String productName) {
		System.out.println("search  by product name : "+productName);
		return this;

	}

	public EcommApplication doSearch(String name, int price) {
		System.out.println("search by name or price :"+name+" : "+price);
		return this;

	}

	public EcommApplication doSearch(String productName, int price, String brand) {
		System.out.println("search by :" +productName+" "+price+" "+brand);
		return this;

	}

	public EcommApplication addToCart(String productName) {
		System.out.println("add to cart : "+productName);
		return this;

	}

	public EcommApplication doPayment(String cc, int cvv) {
		System.out.println("do payment :"+cc+" "+cvv);
		return this;

	}
	public EcommApplication doPayment(String upi) {
		System.out.println("do payment :"+upi);
		return this;

	}

	public EcommApplication doPayment(String paypalID, String password) {
		System.out.println("do payment :"+paypalID+" "+password);
		return this;

	}

	public EcommApplication generateOrder() {
		System.out.println("your order id : " + 12345);
		return this;
	}

	public EcommApplication logout() {
		System.out.println("logout app");
		return this;
	}

}
