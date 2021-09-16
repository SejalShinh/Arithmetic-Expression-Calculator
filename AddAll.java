package expressions;

public class AddAll extends ExpressionCollector{
	
	   public AddAll()
	   {
		   super();
	   }
	   @Override
	   void evaluate() 
	   {
		   int total = 0 ;
		   for (Expression e: expressions)
		   {
			   e.evaluate();
			   total = total + (int) e.getValue();
		   }
		   this.value = total;
	   }
}
