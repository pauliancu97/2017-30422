package com.problems.as1.pr3;

import java.util.*;

public class LargestPalindromeImp {

	public static boolean isPalindrome(int n){
		String s=Integer.toString(n);
		if (s.equals (new StringBuilder(s).reverse().toString())){
			return true;
		}
	return false;
	}
	
	
	public static int getBiggestPalindrome(){ //Returns the biggest palindrome 
		int maxPalindrome = 0;
		for(int i = 999; i  >= 100; i --){
			for(int j = 999; j >= 100; j --){
				if (isPalindrome (i*j) && i*j > maxPalindrome){
					maxPalindrome = i*j;
				}
					
			}
		}
		return maxPalindrome;
	}
	
	public static void main(String[] args){
		System.out.println("Biggest palindrome is: " +getBiggestPalindrome());
	}
}


