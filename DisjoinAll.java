package expressions;

public class DisjoinAll extends ExpressionCollector{
	
	  public DisjoinAll()
	   {
		   super();
	   }
	   @Override
	   void evaluate() 
	   {
		   boolean disjoin = false ;
		   for (Expression e: expressions)
		   {
			   e.evaluate();
			   disjoin = disjoin || (boolean) e.getValue();
		   }
		   this.value = disjoin;
	   }
 
}
