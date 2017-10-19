/* This program calculates the sum of the even Fibonacci numbers < 4 000 000.
 * I solved the problem with dynamic method, in O(n) time.
 * I have a trial with O(log(n)) time, with matrix exponentiation, but it does not work.*/


import java.util.Arrays;



public class secondE {
	
	public static void matrixmultiplication (int A[][], int B[][]) {
		
		int a,b,c,d;
		
		a=A[0][0]*B[0][0]+A[0][1]*B[1][0];
		b=A[0][0]*B[0][1]+A[0][1]*B[1][1];
		c=A[1][0]*B[0][0]+A[1][1]*B[1][0];
		d=A[1][0]*B[0][1]+A[1][1]*B[1][1];
		
		A[0][0]=a;
		A[0][1]=b;
		A[1][0]=c;
		A[1][1]=d;
		
		
		
	}
	
	public static void main (String[] args) {
		int x=1,y=1,aux; int i,j;
		long sum=0;
		while((x < 4000000) || (y<4000000)) {
			if((x%2== 0) && (x<4000000))
				sum +=x;
			if((y%2==0) && (y<4000000))
				sum+=y;
			
			aux=y;
			y+=x;
			x=aux;
		}
		System.out.println(sum);
		
		int [][] fib_Matrix = new int[][] { {2,1}, {1,0}};
		int [][] local_Matrix= fib_Matrix;
		int [][] matrix = {{0,0},{0,0}};
		
				
		int power = 2;
		int sum2 = 0;
		int x1 = fib_Matrix[0][0];
		int x2 = fib_Matrix[1][0];
		
		boolean stop_Condition = true;
		
		while(stop_Condition == true) {
			if((x1 % 2 == 0) )
				sum2 += x1;
			if((x2 % 2 == 0) )
				sum2 += x2;
			
			matrixmultiplication( local_Matrix, fib_Matrix);
			
			x1 = local_Matrix[0][0];
			x2 = local_Matrix[0][1];
			
			if( ( x1>4000000) && (x2 > 4000000))
				stop_Condition = false;
			
		}
		
		System.out.println(sum2);
	}

}
