
public class Polynomial {
	//degree of polynomial,non-negative number	
	private int degree;
	//reference to an array that holds doubles
	//the element at index i is the coefficient of x^i (0 <= i <= degree)
	private double[] coefficients;
	
	/**
	 * Creates the polynomial '0'
	 */
	public Polynomial() {
		degree = 0;
		coefficients = new double[] {0.0};
	}
	
	/**
	 * Creates a polynomial based on the array of coefficients
	 * @param coefficients Reference to an array of doubles that represent the coefficients
	 */
	public Polynomial(double[] coefficients) {
		this.coefficients = coefficients;
		degree = this.coefficients.length - 1;
	}
	
	/**
	 * Gets the degree of the polynomial
	 * @return The degree
	 */
	public int getDegree() {
		return degree;
	}
	
	/**
	 * Gets the coefficient of x^n
	 * @param n The power for which we want to know the coefficient ( non-negative number )
	 * @return If the power is greater than the degree, returns 0, otherwise it returns the coefficient
	 */
	public double getCoefficient(int n) {
		if(n > degree)
			return 0.0;
		return coefficients[n];
	}
	
	/**
	 * Sets the coefficient of x^n in the polynomial
	 * @param n The power for which we want to set the coefficient (must be non-negative)
	 * @param val The value for the new coefficient
	 */
	public void setCoefficient(int n, double val) {
		/*If the power is greater than the current degree, create space for more coefficients
		 and increase the degree to n*/
		if(n > degree) {
			if(val > 0.0) {
				double[] newCoefficients = new double[n+1];
				for(int index=0; index <= degree; index++)
					newCoefficients[index] = coefficients[index];
				newCoefficients[n] = val;
				coefficients = newCoefficients;
				degree = n;
			}
		}
		else if(n >= 0) {//otherwise, just set the coefficient
			coefficients[n] = val;
			if(coefficients[degree] == 0)
				degree--;
		}
	}
	
	/**
	 * Evaluates the polynomial for at a given value
	 * @param x The value at which to evaluate
	 * @return The value of the polynomial at x
	 */
	public double evaluate(double x) {
		double result = 0.0;
		for(int power=0; power <= degree; power++)
			result += Math.pow(x, power) * coefficients[power];
		return result;
	}
	
	public Polynomial getCopy() {
		return new Polynomial(coefficients);
	}
}
