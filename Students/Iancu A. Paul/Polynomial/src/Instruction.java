
public class Instruction {
	
	private InstructionType type;
	private double argument;
	
	public Instruction(InstructionType type) {
		this.type=type;
	}
	
	public Instruction(InstructionType type,double argument) {
		this.type=type;
		this.argument=argument;
	}
	
	public InstructionType getType() {
		return type;
	}
	
	public double getArgument() {
		return argument;
	}
}
