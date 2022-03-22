
public class ArithmeticProgression extends Progression{
	
	protected long stepSize;
	
	public ArithmeticProgression() {
		this(1, 0);
	}
	
	public ArithmeticProgression(long increase) {
		this(increase, 0);
	}
	
	public ArithmeticProgression(long increase, long start) {
		super(start);
		stepSize = increase;
	}
	
	protected void advance() {
		current += stepSize;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmeticProgression ap = new ArithmeticProgression(2,0);
		ap.printProgression(3);
	}

}
