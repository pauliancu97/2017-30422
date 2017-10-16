import java.util.*;
public class Multiple35 {
	
	public static void main(String[] args) 
	{
		
		int i, n, sum = 0, j, br = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter n :");
		n = input.nextInt();
		
		if(n >= 3)
		{
			for(i = 3; i < n; i++)//goes through each number from 3 to n
				{
				if(br == 0)
					if(i % 3 == 0 || i % 5 == 0)
						for(j = 1; j <= i; j++)//if the number is a multiple we add it to the sum one by one verifying at each step if the sum reaches the limit of int
							{
							sum += 1;
							if(sum == 2147483647 && j != i) //if it reaches the limit of int we print out the number and break the loops
								{
								System.out.print(i);
								br = 1;
								break;
								}

							}
				if(br == 1) break;
				}
			if(br == 0) System.out.print(sum);
		}
		else System.out.print(0);
	}
}
