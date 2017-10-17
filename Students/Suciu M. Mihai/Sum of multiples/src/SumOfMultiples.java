import java.util.Scanner;

public class SumOfMultiples {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(n);
		int sum=0;
		for(int i=2;i<n;i++)
			if(i%3==0 || i%5==0)
				sum=sum+i;
		System.out.println(sum);
	}

}