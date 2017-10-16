
public class Palindrom {
	
	public static int isPal(int number)
	{
		int reverse=0;
		int copy=number;
		while(copy>0) {
			reverse=10*reverse+ copy%10;
			copy/=10;
		}
		
		if(reverse==number) return 1;
	return 0;	
	}
	
	public static void main(String[] args) {
		
		int max=100001;
		for(int i=999; i>= 100; i--) {
			for(int j=999; j>=100; j--) {
				int palindromiq=i*j;
				if(max < palindromiq && isPal(palindromiq)==1) {
					max=palindromiq; // We need a max so we enter all loops
				}
			}
		}
		System.out.print(max);
	}

}