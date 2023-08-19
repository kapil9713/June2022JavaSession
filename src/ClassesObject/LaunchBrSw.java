package ClassesObject;

public class LaunchBrSw {
	
	public boolean launchBrowser(String browserName) {
		
		boolean flag=true;
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			System.out.println("ch is launched");
			break;
		case "firefox":
			System.out.println("ff is launched");
			break;
		case "safari":
			System.out.println("saf is launched");
			break;
			
			
		default:
			System.out.println("please pass the right browser :");
			 flag=false;
			 break;
		}
		return flag;
		
	}

	public static void main(String[] args) {

		LaunchBrSw br=new LaunchBrSw();
		
		if(br.launchBrowser("opera")) {
			System.out.println("launch a url");
		}
		else {
			System.out.println("url is not launch");
		}
		
		
		
		
	}

}
