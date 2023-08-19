package OOP_Encapsulation;

public class Browser {

	public void launchBrowser() {
		checkRam();
		checkVersion();
		checkOS();
		checkBrowserServices();
		System.out.println("launchBrowser :");

	}

	private void checkRam() {
		System.out.println("checkRam");

	}

	private void checkVersion() {
		System.out.println("checkVersion");

	}

	private void checkOS() {
		System.out.println("checkOS");

	}

	private void checkBrowserServices() {
		System.out.println("checkBrowserServices");

	}

}
