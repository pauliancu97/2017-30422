package assignments1;

public class FibonacciEvenSum {
	
	public static int recursiveFibonacci(int n) { //time complexity O(1)
        if (n <= 1) return n;
        else return recursiveFibonacci(n-1) + recursiveFibonacci(n-2);
    }
	
	public static int spaceOptimizedFibonacci(int n){ //time complexity O(n)
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

	public static void main(String[] args) {
		int sum=0;
		int i=0;
		do {
			i++;
			if(spaceOptimizedFibonacci(i)%2==0)
				sum=sum+spaceOptimizedFibonacci(i);
		}while(spaceOptimizedFibonacci(i)<4000000);
		System.out.println(sum);
	}

}
