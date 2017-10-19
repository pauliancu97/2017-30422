
import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) { /*

		int n = 1000, i, sum = 0;
		for (i = 1; i < 10; i++)
			if (i % 3 == 0 || i % 5 == 0)
				sum = sum + i;
		System.out.print(sum);
		*/
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i, sum = 0, breakk = 0;
		for (i = 1; i < n; i++)
			if (i % 3 == 0 || i % 5 == 0 && breakk == 0)
				for (int j = 1; j <= i; j++) {
					sum = sum + 1;// For long, insert max long value in next if
					if (sum == Integer.MAX_VALUE) { // max int. if sum > max int -> overflow (sum will equal to a negative
												// number)
						breakk = 1;
						System.out.print(j);// will be the number that causes overflow
						break;
					}

					if (breakk == 1) break;
						
					
				}
		if (breakk == 0)
			System.out.print(sum);

	}

}
