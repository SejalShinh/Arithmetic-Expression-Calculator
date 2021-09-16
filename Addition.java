package expressions;

public class Addition extends Expression{

	Addition(int left, int right) {
		super(left, right);
		
	}
	@Override
	void evaluate() {
		this.value = left + right;
	}
	
}
