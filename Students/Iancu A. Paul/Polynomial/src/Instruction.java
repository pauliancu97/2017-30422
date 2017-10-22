
public class Instruction {
	public static final int ADD=0;
	public static final int SUBTRACT=1;
	public static final int MULTIPLY=2;
	public static final int MUL_SCAL=3;
	public static final int EVAL=4;
	
	private int type;
	private double argument;
	
	public Instruction(int type) {
		this.type=type;
	}
	
	public Instruction(int type,double argument) {
		this.type=type;
		this.argument=argument;
	}
	
	public int getType() {
		return type;
	}
	
	public double getArgument() {
		return argument;
	}
}
