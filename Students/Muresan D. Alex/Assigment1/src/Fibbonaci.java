
public class Fibbonaci {
       static void fibbo(int n)
       {
    	   int fib[]=new int[n+1];
    	   int i,s;
    	   s=0;
    	   fib[0]=1;
    	   fib[1]=1;
    	   for(i=2;i<n;i++)
    	   	{
    		   fib[i]=fib[i-1]+fib[i-2];
    		   if(fib[i]%2==0)
    			   if(fib[i]<4000000)
    				   s=s+fib[i];
    			   else break;
    	   	}
    	   System.out.println(s);
       }
	public static void main(String[] args) {
		fibbo(12);

	}

}
