/* Program which calculates the sum of the multiples of 3 & 5, until it reaches the given limit.
 *Firstlimit is hardcoded = 1000. then it can be read from the keyboard */
import java.util.Scanner;

public class firstE {

	public static void main(String[] args) {
		int i, sum_Multiples=0;
		for(i=0;i<1000;i++) {
			if ((i%3 == 0) || (i%5 == 0)) {
				sum_Multiples+= i;
			}
		}
	
	System.out.println("The value the of sum is " + sum_Multiples);
	sum_Multiples = 0;
	System.out.println("Your value is:\n");
	Scanner in = new Scanner(System.in);
	int users_Num = in.nextInt();
	for(i=0;i<users_Num;i++) {
		if ((i%3 == 0) || (i%5 == 0)) {
			sum_Multiples+= i;
	}
		
	}
	System.out.println("The sum to " + users_Num +" is: " + sum_Multiples);
	

	}
}
