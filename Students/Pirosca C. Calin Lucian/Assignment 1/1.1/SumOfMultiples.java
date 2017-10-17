import java.security.cert.PKIXRevocationChecker.Option;
import java.util.Scanner;

public class SumOfMultiples {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Type 1 for keyboard input value, type 2 for predefined input value");
		int choice = keyboard.nextInt();
		
		switch(choice) {
		case 1:
			sum(keyboard.nextInt());
			break;
		case 2:
			sum(1000);
			break;
		default:
			System.out.println("Unavailable option. Try again");
			break;
		}
	}
	
	public static void sum(int value) {
		int total = 0;
		
		for (int counter = 3; counter < value; counter++)
			if (counter % 3 == 0)
				total += counter;
			else if (counter % 5 == 0)
				total += counter;
		
		System.out.println(total);
	}

}
// To check if an overflow occured one can compare the value of
//Integer.MAX_VALUE with the total between additions or we can perform addition
//using arrays (one slot for one digit of a number) and then compare the 
//value of Integer.MAX_VALUE with the value stored in the slots of the array.
///3rd option is to use libraries that provide safe arithmetic operations.
