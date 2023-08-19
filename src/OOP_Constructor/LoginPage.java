package OOP_Constructor;

public class LoginPage {
	
	String username;
	String password;
	public LoginPage(String username, String password) {
		
		this.username = username;
		this.password = password;
	}
	public boolean doLogin() {
		System.out.println("enter username");
		System.out.println("enter password");
		System.out.println("click login btn");
		System.out.println("user logged in");
		return true;
	}
	public void resetPwd() {
		System.out.println("resetPwd : "+" "+username+" "+password);
	}
	
	

}
