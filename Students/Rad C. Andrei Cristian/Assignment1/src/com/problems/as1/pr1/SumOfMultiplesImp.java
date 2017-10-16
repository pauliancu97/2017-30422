package com.problems.as1.pr1;

import java.util.*;

public class SumOfMultiplesImp implements SumOfMultiples {

	public static long getSum(int limit){
		int  sum = 0;
		for(int i = 1 ; i < limit ; i++){
			if(i%3==0 || i%5==0){
				sum+=i;
			}
		}
		return sum;
	}

	
	public static void printSum(int limit) {
		System.out.println("The sum of multiples of 3 and 5 below " + limit + " is: " + getSum(limit) );
	}
	
	public static void main(String[] args){
		
		int limit;
		Scanner in = new Scanner(System.in);
		limit = in.nextInt();
		// printSum(UPPER_LIMIT); //Uncomment to generate the sum for the predefined limit
		printSum(limit);
		// For numbers above or equal to 95936, an overflow will occur for an integer valu
		in.close();
	}
	
}
