
public class MainClass {
	
	//Method returns the value obtained by reversing the order of the digits in the parameter
	public static int reverseOfNumber(int n) {
		int res=0;
		while(n!=0) {
			res=res*10+n%10;
			n/=10;
		}
		return res;
	}
	
	//Tests whether or not the parameter is a palindrome
	public static boolean isPalindrome(int n) {
		return n==reverseOfNumber(n);
	}
	
	//Returns the biggest number which has the given number of digits
	public static int upperLimitForNumberOfDigits(int n) {
		return (int)(Math.pow(10, n)-1);
	}
	
	//Returns the smallest number which has the given number of digits
	public static int lowerLimitForNumberOfDigits(int n) {
		return (int)(Math.pow(10, n-1));
	}
	
	//Returns the biggest palindrome which can be written as the product of two n digits numbers
	public static int biggestProductPalindromeForNumberOfDigits(int n) {
		int res=0,i,j;
		boolean palindromeFound=false;
		i=j=upperLimitForNumberOfDigits(n);
		while(!palindromeFound) {
			res=i*j;
			if(isPalindrome(res))
				palindromeFound=true;
			else {
				j--;
				if(j<lowerLimitForNumberOfDigits(n)) {
					i--;
					j=i;
				}
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println("Biggest Product Palindrome for 3 digits is "+biggestProductPalindromeForNumberOfDigits(3));
		System.out.println("Biggest Product Palindrome for 4 digits is "+biggestProductPalindromeForNumberOfDigits(4));
	}
}
