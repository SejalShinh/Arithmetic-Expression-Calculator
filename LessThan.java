package expressions;

public class LessThan extends Expression{

	public LessThan(int left, int right) {
		
		super(left, right);
		
	}
	
	@Override
	void evaluate() {
		this.value = (left < right);
	}

}
