import java.math.BigDecimal;
import java.math.RoundingMode;

public class MatrixOperations {
	private static MatrixOperations singleInstance;
	
	private MatrixOperations() {}
	
	public static MatrixOperations getInstance() {
		if(singleInstance == null)
			singleInstance = new MatrixOperations();
		return singleInstance;
	}
	
	public BigDecimal[][] add(BigDecimal[][] first,BigDecimal[][] second){
		if(first.length != second.length || first[0].length != second[0].length)
			return null;
		int rows = first.length, columns = first[0].length;
		BigDecimal[][] result = new BigDecimal[rows][columns];
		for(int i = 0; i < rows; i++)
			for(int j = 0; j < columns; j++) 
				result[i][j] = first[i][j].add(second[i][j]);
		return result;
	}
	
	public BigDecimal[][] subtract(BigDecimal[][] first,BigDecimal[][] second){
		if(first.length != second.length || first[0].length != second[0].length)
			return null;
		int rows = first.length, columns = first[0].length;
		BigDecimal[][] result = new BigDecimal[rows][columns];
		for(int i = 0; i < rows; i++)
			for(int j = 0; j < columns; j++) 
				result[i][j] = first[i][j].subtract(second[i][j]);
		return result;
	}
	
	public BigDecimal[][] multiply(BigDecimal[][] first, BigDecimal[][] second) {
		if(first[0].length != second.length)
			return null;
		int rows = first.length, columns = second[0].length, dimension = second.length;
		BigDecimal[][] result = new BigDecimal[rows][columns];
		for(int i = 0; i < rows; i++)
			for(int j = 0; j < columns; j++) {
				result[i][j] = new BigDecimal(0);
				for(int t = 0; t < dimension; t++) {
					BigDecimal product = first[i][t].multiply(second[t][j]);
					result[i][j] = result[i][j].add(product);
				}
			}
		return result;
	}
		
	public BigDecimal[][] multiplyScalar(BigDecimal[][] matrix,BigDecimal scalar){
		int rows = matrix.length, columns = matrix[0].length;
		BigDecimal[][] result = new BigDecimal[rows][columns];
		for(int i = 0; i < rows; i++)
			for(int j = 0; j < columns; j++)
				result[i][j]=matrix[i][j].multiply(scalar);
		return result;
	}
	
	private void multiplyRowByScalar(BigDecimal[][] matrix, BigDecimal scalar, int row) {
		int columns = matrix[0].length;
		for(int column = 0; column < columns; column++)
			matrix[row][column] = matrix[row][column].multiply(scalar);
	}
	
	private void addTwoRows(BigDecimal[][] matrix, int firstRow, int secondRow) {
		int columns = matrix[0].length;
		for(int column = 0; column < columns; column++)
			matrix[secondRow][column] = matrix[secondRow][column].add(matrix[firstRow][column]);
	}
	
	public BigDecimal determinant(BigDecimal[][] matrix) {
		int dimension = matrix.length;
		BigDecimal[][] temp = new BigDecimal[dimension][dimension];
		for(int row = 0; row < dimension; row++)
			for(int column = 0; column < dimension; column++)
				temp[row][column] = matrix[row][column].plus();
		BigDecimal divisor = new BigDecimal(1), diagProduct = new BigDecimal(1);
		for(int i = 0; i < dimension - 1; i++)
			for(int j = i + 1; j < dimension; j++)
				if(!temp[j][i].equals(BigDecimal.ZERO)) {
					BigDecimal scalar1 = temp[i][i].negate(), scalar2 = temp[j][i].plus();
					multiplyRowByScalar(temp, scalar2, i);
					multiplyRowByScalar(temp, scalar1, j);
					addTwoRows(temp, i, j);
					divisor = divisor.multiply(scalar1.multiply(scalar2));
				}
		for(int i = 0; i < dimension; i++)
			diagProduct = diagProduct.multiply(temp[i][i]);
		return diagProduct.divide(divisor,RoundingMode.CEILING);
	}
	
	public boolean areEqual(BigDecimal[][] first, BigDecimal[][] second) {
		if(first.length != second.length && first[0].length != second[0].length)
			return false;
		int rows = first.length, columns = second.length;
		for(int row = 0; row < rows; row++)
			for(int column = 0; column < columns; column++)
				if(!first[row][column].equals(second[row][column]))
					return false;
		return true;
	}
	
	public boolean isZeroMatrix(BigDecimal[][] matrix) {
		int rows = matrix.length, columns = matrix[0].length;
		for(int row = 0; row < rows; row++)
			for(int column = 0; column < columns; column++)
				if(!matrix[row][column].equals(BigDecimal.ZERO))
					return false;
		return true;
	}
	
	public boolean isIdentityMatrix(BigDecimal[][] matrix) {
		int rows = matrix.length, columns = matrix[0].length;
		for(int row = 0; row < rows; row++)
			for(int column = 0; column < columns; column++)
				if(row == column) {
					if(!matrix[row][column].equals(BigDecimal.ONE))
						return false;
				}
				else {
					if(!matrix[row][column].equals(BigDecimal.ZERO))
						return false;
				}
		return true;
	}
	
	public BigDecimal fillDegree(BigDecimal[][] matrix) {
		int rows = matrix.length, columns = matrix[0].length;
		int nrOfElements = rows * columns, nrOfFilledElements = 0;
		for(int row = 0; row < rows; row++)
			for(int column = 0; column < columns; column++)
				if(!matrix[row][column].equals(BigDecimal.ZERO))
					nrOfFilledElements++;
		return new BigDecimal((double)nrOfFilledElements / nrOfElements * 100);
	}
	
	public BigDecimal[] solveSystem(BigDecimal[][] equations, BigDecimal[] terms) {
		int dimension = equations.length;
		BigDecimal[][] tempEqs = new BigDecimal[dimension][dimension];
		BigDecimal[] tempTerms = new BigDecimal[dimension];
		for(int row = 0; row < dimension; row++)
			for(int column = 0; column < dimension; column++)
				tempEqs[row][column] = equations[row][column].plus();
		for(int index = 0; index < dimension; index++)
			tempTerms[index] = terms[index].plus();
		for(int i = 0; i < dimension - 1; i++)
			for(int j = i + 1; j < dimension; j++)
				if(!tempEqs[j][i].equals(BigDecimal.ZERO)) {
					BigDecimal scalar1 = tempEqs[i][i].negate(), scalar2 = tempEqs[j][i].plus();
					multiplyRowByScalar(tempEqs,scalar2,i);
					multiplyRowByScalar(tempEqs,scalar1,j);
					addTwoRows(tempEqs,i,j);
					tempTerms[i] = tempTerms[i].multiply(scalar2);
					tempTerms[j] = tempTerms[j].multiply(scalar1);
					tempTerms[j] = tempTerms[j].add(tempTerms[i]);
				}
		for(int i = dimension - 1; i > 0; i--)
			for(int j = i - 1; j>= 0; j--)
				if(!tempEqs[j][i].equals(BigDecimal.ZERO)) {
					BigDecimal scalar1 = tempEqs[j][i].negate(), scalar2 = tempEqs[i][i].plus();
					multiplyRowByScalar(tempEqs, scalar1, i);
					multiplyRowByScalar(tempEqs, scalar2, j);
					addTwoRows(tempEqs, i, j);
					tempTerms[i] = tempTerms[i].multiply(scalar1);
					tempTerms[j] = tempTerms[j].multiply(scalar2);
					tempTerms[j] = tempTerms[j].add(tempTerms[i]);
				}
		BigDecimal[] solution = new BigDecimal[dimension];
		for(int i = 0; i < dimension; i++)
			solution[i] = tempTerms[i].divide(tempEqs[i][i],RoundingMode.CEILING);
		return solution;
	}
}
