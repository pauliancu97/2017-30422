import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Spiral {
	
	public static long prime (long n) {
		
		long i, sum = 0;
		if (n % 2 == 0)
			return 0;
		for (i = 1; i <= n; i++)
			if (n % i == 0)
				sum = sum + i;
		
		if (sum == n + 1)
			return 1;
		else 
			return 0;
	}

	public static void main(String[] args) {
	
		int ok = 0, a, b;
		long i = 0, j, n = 1, step = 0, nr = 1;
		double primeCount = 0, oddCount = 1;
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Lower limit : ");
		a = scn.nextInt();
		System.out.print("Upper limit : ");
		b = scn.nextInt();
		if (a > b)
			return;
		
		while (ok == 0) {
			while (i < n / 2) {
				step = step + 2;
				for (j = 0; j < 4; j++) {
					nr = nr + step;
			//computes only the numbers on the corners of each sub-spiral
					oddCount++;
					if (prime(nr) == 1)
						primeCount++;
					}
				i++;
			}
			
			if (oddCount != 0 && primeCount != 0) {
				double pro = primeCount / oddCount * 100;
				if (pro > a && pro < b) {
					pro = BigDecimal.valueOf(pro).setScale(0, RoundingMode.HALF_UP).doubleValue();
					System.out.println("Ratio : " + pro + "%\nn = " + ++n);
					ok = 1;
				}
			}
			n++;
		}
		//works well buuut it takes a lot to cumpute *try for Lower limit 61 and Upper limit 63*
	}
}

