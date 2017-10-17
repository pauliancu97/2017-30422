import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		
		int i, k, n, sum = 0;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("1. Sum of multiples below 1000\n2. Sum of multiples below 'n'\n3. Data type theory\nChoice : ");
		k = scn.nextInt();
		
		switch (k) {
		case 1 :
			for (i = 3; i < 1000; i++)
				if (i % 3 == 0 || i % 5 == 0)
					sum = sum + i;
			
			System.out.println("Answer : " + sum);
			sum = 0;
			break;
			
		case 2 :
			System.out.print("n = ");
			n = scn.nextInt();
			
			for (i = 3; i < n; i++)
				if (i % 3 == 0 || i % 5 == 0)
					sum = sum + i;
			
			System.out.println("Answer : " + sum);
			sum = 0;
			break;
		
		case 3 : 
			System.out.println("Integer numbers are represented on 32 bits in 2's Complement => overflow above [2^31 - 1] or below [2^31].\n"
					+ "Long variables are represented on 64 bits in 2's Complement => overflow above [2^63 - 1] or below [2^63].");
			break;
			
		default :
			System.out.println("Keep on trying!");
		}
		
		
		
	}
}
