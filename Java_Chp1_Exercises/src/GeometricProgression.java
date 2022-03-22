
public class GeometricProgression extends Progression {
	
	protected long base;
	
	public GeometricProgression() {
		this(2, 1);
	}
	
	public GeometricProgression(long constant) {
		this(constant, 1);
	}
	
	public GeometricProgression(long constant, long start) {
		super(start);
		base = constant;
	}
	
	protected void advance() {
		current *= base;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeometricProgression gp = new GeometricProgression();
		gp.printProgression(5);
	}

}
