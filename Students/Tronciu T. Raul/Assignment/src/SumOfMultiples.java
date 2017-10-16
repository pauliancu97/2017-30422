import java.util.Scanner;

public class SumOfMultiples {

	public static void main(String[] args) {
		Scanner getNumber = new Scanner(System.in);
		int counter, limitNumber;
		
		System.out.println("Enter the limit number: ");
		limitNumber = getNumber.nextInt();
		
		int sumOfMultiples;
		sumOfMultiples = 0;
		
		for (counter = 1; counter < limitNumber; counter++) {
			if ((counter % 3 == 0) || (counter % 5 == 0)) {
				sumOfMultiples = sumOfMultiples + counter;
			}
		}
		System.out.println(sumOfMultiples);
	}

}
