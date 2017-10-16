
public class Fibonacci {
	static void fib(int n)
	{ int fibo[]=new int[n+1];
	  int sum=0;
	fibo[0]=0;
	fibo[1]=1;
	for( int i=2;i<=n;i++) {
		fibo[i]=fibo[i-1]+fibo[i-2];
		if(fibo[i]%2==0)
			if(fibo[i]<4000000)
			 sum+=fibo[i];
			else break; 
		
			}
	System.out.print(sum);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	fib(20000);
	}

}
