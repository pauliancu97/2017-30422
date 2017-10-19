//This doesn't work properly yet
//Now it works

public class LargestPalindrome {

	public static void main(String[] args) {
		int firstCounter;
		int secondCounter;
		int maximumPalindrome;
		int productOfCounters;
		int auxiliarForProduct;
		int palindrome;
		int firstNumber;
		int secondNumber;

		maximumPalindrome = 0;
		firstNumber = 0;
		secondNumber = 0;

		for (firstCounter = 999; firstCounter >= 100; firstCounter--) {
			for (secondCounter = 999; secondCounter >= 100; secondCounter--) {
				productOfCounters = firstCounter * secondCounter;
				auxiliarForProduct = productOfCounters;
				palindrome = 0;

				while (auxiliarForProduct > 0) {
					palindrome = ((palindrome  * 10) + (auxiliarForProduct % 10));

					auxiliarForProduct /= 10;
				}

				if (palindrome == productOfCounters) {
					if (palindrome > maximumPalindrome) {
						maximumPalindrome = palindrome;
						firstNumber = firstCounter;
						secondNumber = secondCounter;
					}
				}
			}
		}

		System.out.print("Largest palindrome made from the product of the 3-digit numbers is ");
		System.out.print(maximumPalindrome);
		System.out.print(" = ");
		System.out.print(firstNumber);
		System.out.print(" x ");
		System.out.println(secondNumber);

	}

}
