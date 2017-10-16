
public class MainClass {
	public static int integerLogBase2(int n) {
		return (int)(Math.log(n)/Math.log(2));
	}
	
	public static int fibonacciLogarithmic(int n) {
		if(n==1)
			return 1;
		if(n==2)
			return 1;
		int tp=1,ti=0,ntp,nti,temp;
		for(int i=1;i<=integerLogBase2(n);i++) {
			ntp=(2*ti+tp)*tp;
			nti=ti*ti+tp*tp;
			tp=ntp;
			ti=nti;
		}
		for(int i=1;i<=n-(int)(Math.pow(2,integerLogBase2(n)));i++) {
			temp=tp;
			tp+=ti;
			ti=temp;
		}
		return tp;
	}
	
	public static long sumEvenFibonacci() {
		int index=1;
		long sum=0;
		while(fibonacciLogarithmic(index)<4000000) {
			if(fibonacciLogarithmic(index) % 2 == 0)
				sum+=fibonacciLogarithmic(index);
			index++;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(sumEvenFibonacci());
	}
}
