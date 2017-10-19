
public class Fibonacci {

	public static void main(String[] args) {
		
		int i = 1, j = 2, aux;
		long n = 0;

		while (i < 4000000 && j < 4000000) {
			
			if (i % 2 == 0)
				n = n + i;
			if (j %2 == 0)
				n = n + j;
			
			i = i + j;
			j = j + i;
		}
		
		System.out.println("The even-valued sum is : " + n);
	}

}
