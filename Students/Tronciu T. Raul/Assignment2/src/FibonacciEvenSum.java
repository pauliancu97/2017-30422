
public class FibonacciEvenSum {

	public static void main(String[] args) {
		int firstNumber;
		int secondNumber;
		int sumOfNumbers;
		int sumEvenNumbers;
		
		sumEvenNumbers = 0;
		firstNumber = 1;
		secondNumber = 1;
		sumOfNumbers = firstNumber + secondNumber;
		
		while (sumOfNumbers <= 4000000) {
			firstNumber = secondNumber;
			secondNumber = sumOfNumbers;
			
			if (sumOfNumbers % 2 == 0) {
				sumEvenNumbers += sumOfNumbers;
			}
			
			sumOfNumbers = firstNumber + secondNumber;
		}
		
		System.out.print("The sum of the even-valued terms is ");
		System.out.println(sumEvenNumbers);
	}

}
