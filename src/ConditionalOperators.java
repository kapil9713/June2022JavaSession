
public class ConditionalOperators {

	public static void main(String[] args) {
		
		int i=10;
		int j=20;
		
		System.out.println(i==j); //false
		
		System.out.println(10==20); //false
		
		System.out.println(10==10); //true
		
		//compare with if else
		
		if(i==j) {
			System.out.println("Both are equal");
		}
		else {
			System.out.println("Both are not equal");
		}
		
		// > >= < <= ==
		
		if(i>j) {
			System.out.println("i is greater than j!");
		}
		else {
			System.out.println("j is greater!");
		}
		if(i>=j) {
			System.out.println("i is gr than or equal to j@");
		}
		else {
			System.out.println("j is greater@");
		}
		if(i<j) {
			System.out.println("i is smaller than j#");
		}
		else {
			System.out.println("j is greater#");
		}
		if(i<=j) {
			System.out.println("i is smaller than or equal to j$");
		}else {
			System.out.println("j is greater$");
		}
		if(i==j) {
			System.out.println("both are equal%");
		}
		
		//
		int total =100;
		if(total!=100) {
		System.out.println("BYE");
		}
		else {
			System.out.println("HI");
		}
		
		System.out.println("****************");
		
		int marks=90;
		if(marks<=90) {
			System.out.println("valid marks");
		}
		if(marks>=90) {
			System.out.println("A++ Grade");
		}
		if(marks>=95) {
			System.out.println("Eligible for SCH");
		}
		if(marks==100) {
			System.out.println("Fees Waived OFF");
		}
		if(marks<=80) {
			System.out.println("B Grade");
		}
		else {
			System.out.println("Not a Valid Marks");
		}
				
				
		System.out.println("*******************");
		
		String browser="safari";
		if(browser.equals("chrome")) {
			System.out.println("chrome is launched");
		}
		 if(browser.equals("firefox")) {
			System.out.println("firefox is launched");
		}
		 if(browser.equals("safari")) {
			System.out.println("safari is launched");
		}
		 if(browser.equals("edge")) {
			System.out.println("edge is launched");
		}
		 if(browser.equals("opera")) {
			System.out.println("opera is launched");
		}
		
		else {
			System.out.println("invalid browser");
		}
		
		System.out.println("**********************");
		
		
		String browser1="opera";
		if(browser1.equals("chrome")) {
			System.out.println("chrome is launched");
		}
		else if(browser1.equals("firefox")) {
			System.out.println("firefox is launched");
		}
		else if(browser1.equals("safari")) {
			System.out.println("safari is launched");
		}
		else if(browser1.equals("edge")) {
			System.out.println("edge is launched");
		}
		else if(browser1.equals("opera")) {
			System.out.println("opera is launched");
		}
		
		else {
			System.out.println("invalid browser");
		}
		
		
		

	}

}
