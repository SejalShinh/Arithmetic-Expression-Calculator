package expressions;

public class Subtraction extends Expression{

	public Subtraction(int left, int right) {
		super(left, right);
	}
	
	@Override
	void evaluate() {
		this.value = left - right;
		
	}

}
