//Knowing that every third term is an even number, and considering the first two even
//terms to be 0 and 2 we'll be using the following formula to determine the next ones
// and add them . Fn = 4*F(n-1)+F(n-2)

//Solving this problem in O(log n) time can be done using Matrix Exponentiation

public class FibonacciEvenSum {

	public static void main(String[] args) {
		int first = 0; int second = 2; int total = 0; int auxiliar;
		
		while (first < 4000000 && second < 4000000) {
			total += second;
			auxiliar = 4*second + first;
			first = second; second = auxiliar;
		}
		System.out.println(total);
		total = reccursiveFib(7);
		System.out.println(total);
	}
	
	public static int reccursiveFib(int nth) { //2nd method not working YET
		if (nth == 0)
			return 0;
		if (nth == 1)
			return 2;
		return (4*reccursiveFib(nth-1)+reccursiveFib(nth-2)); //To be checked and redo
	}//run out of time to finish it

}

// In a reccursive way, using the above-mentioned formula we can see that the 
// 6th even fibonacci number is 2584, and the 11th number is the largest even number
// smaller than 4mil

