
public class IncrementalAndDecrementalOperators {

	public static void main(String[] args) {
		
		//1. Post Increment ++
		
		int a=1;
		int b=a++;
		System.out.println(a); //2
		System.out.println(b); //1
		
		int c=-99;
		int d=c++;
		System.out.println(c); //-98
		System.out.println(d); //-99
		
		int x=10;
		int y=x++;
		System.out.println(x); //11
		System.out.println(y); //10
		
		//2. Pre Increment
		
		int t=1;
		int u=++t;
		System.out.println(t); //2
		System.out.println(u); //2
		
		int k=-99;
		int p=++k;
		System.out.println(k); //-98
		System.out.println(p); //-98
		
		int g=-1001;
		int h=++g;
		System.out.println(g); //-1000
		System.out.println(h); //-1000
		
		//3. Post Decrement
		
		int s=2;
		int v=s--;
		System.out.println(s); //1
		System.out.println(v); //2
		
		int l1=-999;
		int l2=l1--;
		System.out.println(l1); //-1000
		System.out.println(l2); //-999
		
		//4. Pre Decrement
		
		int r1=2;
		int r2=--r1;
		System.out.println(r1); //1
		System.out.println(r2); //1
		
		////---------------------////
		
		int num=10;
		System.out.println(num++); //10
		System.out.println(num); //11
		
		int total=10;
		System.out.println(++total); //11
		System.out.println(total); //11
		
		System.out.println(2*10); //20
		
		System.out.println(-2*10); //-20
		
		System.out.println(-2*-10); //20
		
		float f=2.5f;
		float j=f++;
		System.out.println(f); //3.5
		System.out.println(j); //2.5
		
		//IQ
		char ch='a';
		System.out.println(++ch); //b
		
		//System.out.println(ch); //b
		System.out.println((int)++ch); //99
		
		char th='1';
		System.out.println(++th); //2
		System.out.println(th); //2
		System.out.println((int)++th); //51
		
		////******************////
		
		//String test="Hello";
		//System.out.println(++test); we are not used ++,--
		//operator on String
		
		int pop=1;
		int p1=pop+1;
		System.out.println(p1);
		
		int j1=1;
		System.out.println(j1++); //1-consume by println so that
		//output is one.
        
		System.out.println(j1); //2 Here j1 new value after post 
		//increment will be 2
		
		byte f1=100;
		byte f2=100;
		int f3=f1+f2;
		System.out.println(f3);
		
		
		//IQ
		char jj='z'; //122
		System.out.println(++jj); //123
		
		
		
		
		
		
		
		
		
	}

}
