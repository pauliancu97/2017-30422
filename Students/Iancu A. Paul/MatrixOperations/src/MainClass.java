import java.math.BigDecimal;

public class MainClass {
	public static void main(String[] args) {
		/*BigDecimal[][] first= {{ new BigDecimal(1) , new BigDecimal(3) },
							   { new BigDecimal(2) , new BigDecimal(8) }};*/
		BigDecimal[][] first= {{ new BigDecimal(1) , new BigDecimal(2), new BigDecimal(8) },
                               { new BigDecimal(7) , new BigDecimal(9), new BigDecimal(9) },
                               { new BigDecimal(4) , new BigDecimal(1), new BigDecimal(5) }};
		BigDecimal[][] second= {{ new BigDecimal(1) , new BigDecimal(2), new BigDecimal(8) },
				                { new BigDecimal(7) , new BigDecimal(3), new BigDecimal(9) },
				                { new BigDecimal(4) , new BigDecimal(1), new BigDecimal(5) }};
		MatrixOperations matrixOps = MatrixOperations.getInstance();
		/*BigDecimal[][] res = matrixOps.multiply(first, second);
		for(int i = 0; i < res.length; i++) {
			for(int j = 0; j < res[0].length; j++)
				System.out.print(res[i][j]+" ");
			System.out.println("");
		}*/
		BigDecimal[][] equations = {{ new BigDecimal(2), new BigDecimal(1) },
				                    { new BigDecimal(3), new BigDecimal(5)}};
		BigDecimal[] terms = { new BigDecimal(4), new BigDecimal(13) };
		BigDecimal[] solution = matrixOps.solveSystem(equations, terms);
		for(int i = 0; i < solution.length; i++)
			System.out.print(solution[i]+" ");
		
	}
}
