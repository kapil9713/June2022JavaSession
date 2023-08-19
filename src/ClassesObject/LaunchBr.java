package ClassesObject;

public class LaunchBr {
	
	public boolean launchBrowser(String browserName) {
		if(browserName.equals("chrome")) {
			System.out.println("launch a browser");
			return true;
		}
		else if(browserName.equals("firefox")) {
			System.out.println("launch a browser");
			return true;
		}
		else if(browserName.equals("Safari")) {
			System.out.println("launch a browser");
			return true;
		}
		else {
			System.out.println("Please pass the right browser :"+browserName);
			return false;
		}
	}

	public static void main(String[] args) {
		
		
		LaunchBr br=new LaunchBr();
		boolean launchBrowser = br.launchBrowser("edge");
		System.out.println(launchBrowser);

		
		
		
	}

}
