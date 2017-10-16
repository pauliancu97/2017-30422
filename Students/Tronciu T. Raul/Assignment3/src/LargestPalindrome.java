//This doesn't work properly yet

public class LargestPalindrome {

	public static void main(String[] args) {
		int firstCounter;
		int secondCounter;
		int maximumPalindrome;
		int productOfCounters;
		int auxiliarForProduct;
		int palindrome;
		int power;
		int firstNumber;
		int secondNumber;
		
		maximumPalindrome = 0;
		firstNumber = 0;
		secondNumber = 0;
		
		for (firstCounter = 999; firstCounter >= 100; firstCounter--) {
			for (secondCounter = 999; secondCounter >= 100; secondCounter--) {
				productOfCounters = firstCounter * secondCounter;
				auxiliarForProduct = productOfCounters;
				power = 0;
				palindrome = 0;
				
				while (auxiliarForProduct > 0) {
					palindrome = (int) (palindrome + ((auxiliarForProduct % 10) * (Math.pow(10, power))));
					
					power++;
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
