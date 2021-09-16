package expressions;

public class ConjoinAll extends ExpressionCollector{
	
	  public ConjoinAll()
	   {
		   super();
	   }
	   @Override
	   void evaluate() 
	   {
		   boolean total = true ;
		   for (Expression e: expressions)
		   {
			   e.evaluate();
			   total = total && (boolean) e.getValue();
		   }
		   this.value = total;
	   }

}
