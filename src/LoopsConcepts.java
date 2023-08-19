
public class LoopsConcepts {

	public static void main(String[] args) {

		// WhileLoop
		// 1 to 10
		int i = 0;
		while (i <= 10) {
			System.out.println(i);
			++i;
		}

		// Print some Statement Infinite Times
		while (true) {
			System.out.println("Welcome to Taj Hotel");
			break;
		}

		// Print Even Number/Odd Number
		int p = 2;
		while (p <= 100) {
			System.out.println(p);
			// p=p+1;
			p = p + 2; // Odd Number

		}
		System.out.println("******");

		int num = 1;
		while (num <= 10) {
			System.out.println(num);

			if (num%5 == 0) {
				System.out.println("Hi");
				

			}
			num++;
			
			
		}
		//Print Your Name 5 Times
		
		int n=1;
		while(n<=5) {
			System.out.println("kapil");
			n=n+1;
		}
		
		
		
		

	}

}
