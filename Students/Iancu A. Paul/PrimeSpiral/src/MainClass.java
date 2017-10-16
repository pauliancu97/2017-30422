
public class MainClass {
	/*
	 * Method takes as a parameter the number of the current
	 * iteration and returns the side length of the matrix
	 */
	public static int sideLengthAtIteration(int iteration) {
		return 2*iteration-1;
	}
	
	/*
	 * Method takes as parameters 2 numbers
	 * First parameter is the order of the element on the frame
	 * (the order must not be bigger than the number of elements 
	 * on the frame and bigger than 0)
	 * Second parameter is the number of the iteration for which we
	 * want to find an element on the frame
	 * Returns the element on the frame with the specified order at the specified iteration
	 */
	public static int elementOnFrameAtIteration(int order,int iteration) {
		return sideLengthAtIteration(iteration-1)*sideLengthAtIteration(iteration-1)+order;
	}
	
	/*
	 * Method takes as a parameter the number of iteration and returns the number of elements
	 * on the diagonals for that matrix
	 */
	public static int nrOfElementsOnDiagonalsAtIteration(int iteration) {
		return 2*sideLengthAtIteration(iteration)-1;
	}
	
	/*
	 * Method takes as a parameter a number and tests if it is prime
	 * Returns true if it's prime, false otherwise
	 */
	public static boolean isPrime(int n) {
		for(int i=2;i<=n/2;i++)
			if(n % i == 0)
				return false;
		return true;
	}
	/*
	 * Method takes as a parameter a given ratio and returns the smallest side length for 
	 * which the ratio of primes on the diagonals over the number of elements on the diagonals
	 * is smaller than the given ratio*/
	public static int sideLengthMinRatio(double ratioMin) {
		int iteration=1,nrOfPrimes=0;
		boolean iterate=true;
		do {
			iteration++;
			for(int i=1;i<=4;i++)//Checks if the elements on the corners of the frame are prime
				if(isPrime(elementOnFrameAtIteration(i*(sideLengthAtIteration(iteration-1)+1),iteration)))
					nrOfPrimes++;
			double ratio=(double)nrOfPrimes/nrOfElementsOnDiagonalsAtIteration(iteration);
			if(ratio<ratioMin)
				iterate=false;
			System.out.println(ratio);
		}while(iterate);
		return sideLengthAtIteration(iteration);
	}
	
	public static void main(String[] args) {
		System.out.println(sideLengthMinRatio(0.1));
		
	}
}
