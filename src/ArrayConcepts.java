import java.util.Arrays;

public class ArrayConcepts {

	public static void main(String[] args) {

		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		System.out.println(i[2]);

		//System.out.println(i[4]); // AIOB
		
		//To Print all values without Loop
		
		System.out.println(Arrays.toString(i));
		
		
		
		
		

		for (int k = 0; k <= i.length - 1; k++) {
			System.out.println(i[k]);

		}

		System.out.println("****************");

		// For Each

		for (int e : i) {
			System.out.println(e);

			if (e == 30) {
				System.out.println("Hi!!");

			} else {
				System.out.println("bye!");
			}

		}
		System.out.println("***********************************");
		
		char ch[]=new char [5];
		
		ch[0]='a';
		ch[1]='e';
		ch[2]='i';
		ch[3]='o';
		ch[4]='u';
		
		for(char e:ch) {
			System.out.println((int)e); //To Print Ascii Value
		}
		System.out.println(ch.length);
		System.out.println(ch.length-1);
		
		//To Print Ascii Value 
		
		
		
		System.out.println("-------------------");
		
		System.out.println(Arrays.toString(ch));
		
		System.out.println("*******************");
		
		String lang[]=new String[5];
		
		lang[0]="";
		lang[1]="Phython";
		lang[2]="Ruby";
		lang[3]="JavaScript";
		lang[4]="DotNet";
		
		System.out.println(lang[0]); //AIOB Exception
		
		for(String e:lang) {
			System.out.println(e);
			
			if(e.equals("Java")) {
				System.out.println("Hi");
			}if(e.equals("JavaScript")) {
				System.out.println("Bye");
			}
		}
		
		
		

	}

}
