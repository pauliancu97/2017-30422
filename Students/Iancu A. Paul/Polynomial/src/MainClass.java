
public class MainClass {
	public static void main(String[] args) {
		InputOutput io=new InputOutput("pol.txt","out.txt");
		Polynomial first,second,result;
		Instruction instruction;
		double val;
		first = io.readPolynomial();
		second = io.readPolynomial();
		io.skipLine();
		while((instruction = io.readInstruction()) != null) {
			switch(instruction.getType()) 
			{
			case Instruction.ADD:
				result=Functions.add(first, second);
				io.write(result);
				break;
			case Instruction.SUBTRACT:
				result=Functions.subtract(first, second);
				io.write(result);
				break;
			case Instruction.MULTIPLY:
				result=Functions.multiply(first, second);
				io.write(result);
				break;
			case Instruction.MUL_SCAL:
				result=Functions.scale(first, instruction.getArgument());
				io.write(result);
				result=Functions.scale(second, instruction.getArgument());
				io.write(result);
				break;
			case Instruction.EVAL:
				val = first.evaluate(instruction.getArgument());
				io.write(val);
				val = second.evaluate(instruction.getArgument());
				io.write(val);
				break;
			}
		}
		io.close();
	}
}
