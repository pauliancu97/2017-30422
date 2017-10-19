import java.util.Scanner;

public class MainClass {
	/*Method calculates the sum of the first n positive integers*/
	public static int GaussSum(int n) {
		return n*(n+1)/2;
	}
	
	/*Adds all the multiples of 3 smaller than n,all the multiples of 5 smaller than n,
	 * subtracts all the multiples of 15 smaller than n*/
	public static int sumOfMultiples(int n) {
		return 3*GaussSum((n-1)/3)+5*GaussSum((n-1)/5)-15*GaussSum((n-1)/15);
	}
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		System.out.println(sumOfMultiples(n));
	}
}
