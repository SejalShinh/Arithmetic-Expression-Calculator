package expressions;

public class Equal extends Expression{

	public Equal(int left, int right) {
		
		super(left, right);
	}
	
	@Override
	void evaluate() {
		this.value = (left == right);
	}
	

}
