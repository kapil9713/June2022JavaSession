
public class SwitchCaseConcept {

	public static void main(String[] args) {
		
		String browser="safari";
		
		switch (browser) {
		case "chrome":
			System.out.println("chrome is launched");
			break;
		case "firefox":
			System.out.println("firefox is launched");
			break;
		case "safari":
			System.out.println("safari is launched");
			break;
		case "edge":
			System.out.println("edge is launched");
			break;
		case "opera":
			System.out.println("opera is launched");
			break;

		default:
			System.out.println("invalid browser-plz pass the right browser");
			break;
		}
		
		System.out.println("*************");
		
		char ch='s';
		
		switch (ch) {
		case 'a':
			System.out.println("it is a vowel");
			break;
		case 'b':
			System.out.println("it is not a vowel");
			break;
		case 'i':
			System.out.println("it is a vowel");
			break;
		case 'z':
			System.out.println("it is not a vowel");
			break;
		case 'g':
			System.out.println("it is not a vowel");
			break;
		case 'e':
			System.out.println("it is a vowel");
			break;
		case 'o':
			System.out.println("it is a vowel");
			break;
		case 'd':
			System.out.println("it is not a vowel");
			break;
		case 'u':
			System.out.println("it is a vowel");
			break;

		default:
			System.out.println("Not in a list");
			break;
		}
		

	}

}
