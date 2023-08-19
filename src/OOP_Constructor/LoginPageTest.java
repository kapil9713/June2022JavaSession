package OOP_Constructor;

public class LoginPageTest {

	public static void main(String[] args) {

		
		LoginPage lp1=new LoginPage("naveen@gmail.com", "naveen@123");
		if(lp1.doLogin()) {
			System.out.println("display the menu items");
		}
		
		LoginPage lp2=new LoginPage("kapil9713@gmailcom","kapil9713");
		
		lp2.resetPwd();
		
		
	}

}
