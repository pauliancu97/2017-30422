package com.as1.p2;

public class FibonacciEvenSum {

	public final static int UPPER_LIMIT=4000000;
	
	//For exponential time
	public static int getFibonacciRec(int n) {
		if (n == 0) {
			return 0;
		}
			
		if (n == 1) {
			return 1;
		}
		else {
			return getFibonacciRec(n - 1) + getFibonacciRec(n - 2) + 1;
		//Value of n up to 33 (Index of the biggest Fibonacci number in the sequence under 4000000). Got stuck and gave up on the recursive method :(
		}
	}
	
	//For O(n) Time
	public static int getNextFibonacci(int previous2, int previous1) {
		if(previous2 < 0 || previous1 <0 ) {
			throw new IllegalArgumentException("Values of Fibonacci sequence numbers cannot be lesser than zero");
		}
		return previous2 + previous1;
	}
	
	public static int getFibonacciSum() {
		int sum=0;
		int first=1; int second=2;
		while (second < UPPER_LIMIT) {
			if (second%2==0) {
				sum+=second;
			}
			int temp=getNextFibonacci(first,second);
			first=second;
			second=temp;
		}
		
		return sum;
	}
	
	
	//For O(log n) Time - Based on matrix multiplication
	
	private static void multiplyMatrix(int[][] m1, int[][] m2) {

		int a = m1[0][0] * m2[0][0] +  m1[0][1] * m2[1][0];
        int b = m1[0][0] * m2[0][1] +  m1[0][1] * m2[1][1];
        int c = m1[1][0] * m2[0][0] +  m1[1][1] * m2[0][1];
        int d = m1[1][0] * m2[0][1] +  m1[1][1] * m2[1][1];

        m1[0][0] = a;
        m1[0][1] = b;
        m1[1][0] = c;
        m1[1][1] = d;
    }
	
	public static int  getNthFibonacci(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("The argument value cannot be negative");
		}
		if (n <= 1) {
			return n;
		}
		int[][] resultMatrix = {{1,0},{1,1}};
		int[][] fibonacciMatirx= {{1,1},{1,0}};
		
		while(n>0) {
			if (n%2 == 1) {
                multiplyMatrix(resultMatrix, fibonacciMatirx);
            }
            n = n / 2;
            multiplyMatrix(fibonacciMatirx, fibonacciMatirx);

		}
		return resultMatrix[1][0];
			
	}
	
	public static int getFibonacciSumOLogn() {
		int sum = 0;
		for (int i = 0; i <= 33; i ++) {
			if (getNthFibonacci(i) % 2 == 0) {
				sum+=getNthFibonacci(i);
			}
		}
		return sum;
	}
	
	
	public static void printFibonacciSum() {
		
		System.out.println("The sum of the even numbers in the Fibonacci sequence that do not exceed 4.000.000 is: " + getFibonacciSum());
		System.out.println("The sum of the even numbers in the Fibonacci sequence that do not exceed 4.000.000 (using O(log n)is: " + getFibonacciSumOLogn() );
		//The two differ, for some reason. Needs re-check
	}
	
	public static void main(String[] args) {
		printFibonacciSum();
	}
}
