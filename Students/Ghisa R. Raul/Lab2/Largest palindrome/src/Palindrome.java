import java.util.Scanner;

public class Palindrome {
	
	public static long rev (long n) {
		
		if (n == 0)
			return 0;
		
		long cpy, inv = 0;
		cpy = n;
		
		while (cpy != 0) {
			inv = inv * 10 + cpy % 10;
			cpy = cpy / 10;
		}
		
		if (inv == n)
			return n;
		else 
			return 0;
	}
	
	public static long palindrom (long n) {

		if (n == rev(n))
			return 1;
		else 
			return 0;
	}


	public static void main(String[] args) {
		
		int a, b, k = 0;
		long n = 0, max = 0;

		Scanner scn = new Scanner(System.in);
		System.out.print("1. The largest palindrom made from product of two 3-digit number\n" +
		"2. The largest palindrom made from product of two 4-digit number\nChoice : ");
		
		k = scn.nextInt();
		
		switch (k) {
		case 1 : 
			for (a = 100; a <= 999; a++)
				for (b = 100; b <= 999; b++) {
					n = a * b;
					if (palindrom(n) != 0 && n > max)
						max = n;
				}
			System.out.println("Answer : " + max);
			break;
			
		case 2 :
			for (a = 1000; a <= 9999; a++)
				for (b = 1000; b <= 9999; b++) {
					n = a * b;
					if (palindrom(n) != 0 && n > max)
						max = n;
				}
			System.out.println("Answer : " + max);
			break;
			
		default :
			System.out.println("Keep on trying!");
		}
	}
}
