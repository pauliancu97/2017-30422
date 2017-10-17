package com.as1.p3;

public class LargestPalindrome {

	public static boolean isPalindrome(int n) {
		
		String s=Integer.toString(n);
		if (s.equals (new StringBuilder(s).reverse().toString())) {
			return true;
		}
	return false;
	}
	
	
	public static int getBiggestPalindrome() { //Returns the biggest palindrome 
		
		int maxPalindrome = 0;
		for(int i = 999; i  >= 100; i --) { //Change i's range to [1000, 9999] for 4 digits twist 
			for(int j = 999; j >= 100; j --) { //Same range for j
				if (isPalindrome (i*j) && i*j > maxPalindrome) {
					maxPalindrome = i*j;
				}
					
			}
		}
		return maxPalindrome;
	}
	
	public static void main(String[] args) {
		System.out.println("Biggest 3 digit palindrome is: " +getBiggestPalindrome());
	}
}


