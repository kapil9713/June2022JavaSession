package ClassesObject;

public class Application {

	public void test() {
		System.out.println("0 parameter");

	}

	public void test(int i) {
		System.out.println("1 parameter");

	}

	public void test(String i) {

	}

	public void test(String i, int j) {
		System.out.println("2 parameter");

	}

	public void test(int i, String j) {

	}

	public static void main(String[] args) {

		Application obj = new Application();
		obj.test(10);

	}

}
