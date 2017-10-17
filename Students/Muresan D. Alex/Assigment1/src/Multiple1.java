import java.util.Scanner;

public class Multiple1 {

	public static void main(String[] args) {
	  int i,s,n;
	  s=0;
	  Scanner scanIn=new Scanner(System.in);
	  n=scanIn.nextInt();
	  for(i=1;i<n;i++)
	  	{
		  if(i%3==0 || i%5==0)
			  s=s+i;
	  	}
      System.out.print(s);
	}

}
