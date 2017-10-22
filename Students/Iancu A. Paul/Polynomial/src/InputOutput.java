import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class InputOutput {
	Scanner in;
	PrintWriter out;
	
	public InputOutput(String fileIn,String fileOut) {
		try {
			in = new Scanner(new File(fileIn));
			out = new PrintWriter(fileOut);
		}catch(Exception ex) {}
	}
	
	public Polynomial readPolynomial() {
		if(!in.hasNextLine())
			return null;
		String line = in.nextLine();
		String[] stringCoefficients = line.split(" ");
		double[] coefficients = new double[stringCoefficients.length];
		for(int index = 0; index < coefficients.length; index++)
			coefficients[index]=Double.parseDouble(stringCoefficients[coefficients.length - 1 - index]);
		return new Polynomial(coefficients);
	}
	
	public Instruction readInstruction() {
		if(!in.hasNextLine())
			return null;
		String line = in.nextLine();
		if(line.equals("ADD"))
			return new Instruction(Instruction.ADD);
		if(line.equals("SUBTRACT"))
			return new Instruction(Instruction.SUBTRACT);
		if(line.equals("MULTIPLY"))
			return new Instruction(Instruction.MULTIPLY);
		String[] split=line.split(" ");
		String command=split[0];
		double argument=Double.parseDouble(split[1]);
		if(command.equals("MUL_SCAL"))
			return new Instruction(Instruction.MUL_SCAL,argument);
		return new Instruction(Instruction.EVAL,argument);
	}
	
	public void skipLine() {
		in.nextLine();
	}
	
	public void write(double value) {
		out.println(value);
	}
	
	public void write(Polynomial polynomial) {
		int degree = polynomial.getDegree();
		double coefficient = polynomial.getCoefficient(degree);
		if(degree > 1)
			out.print(coefficient+"x^"+degree);
		for(int power = degree-1; power >= 2 ;power--) {
			coefficient = polynomial.getCoefficient(power);
			if(coefficient != 0)
				if(coefficient > 0.0)
					out.print("+"+coefficient + "x^" + power);
				else
					out.print(coefficient + "x^" + power);
		}
		coefficient=polynomial.getCoefficient(1);
		if(coefficient != 0)
			if(coefficient > 0.0)
				out.print("+"+coefficient + "x");
			else
				out.print(coefficient + "x");
		coefficient=polynomial.getCoefficient(0);
		if(coefficient != 0 || degree==0)
			if(coefficient > 0.0)
				out.print("+"+coefficient);
			else
				out.print(coefficient);
		out.println("");
	}
	
	public void close() {
		out.close();
	}
}
