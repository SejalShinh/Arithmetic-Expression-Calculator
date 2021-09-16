package expressions;

public class GreaterThan extends Expression{

	public GreaterThan(int left, int right) {
		
		super(left, right);
		
	}
	@Override
	void evaluate() {
		value = (left > right);
	}

}
