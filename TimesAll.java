package expressions;

public class TimesAll extends ExpressionCollector{

	  public TimesAll()
	   {
		   super();
	   }
	   @Override
	   void evaluate() 
	   {
		   int total = 1 ;
		   for (Expression e: expressions)
		   {
			   e.evaluate();
			   total = total * (int) e.getValue();
		   }
		   this.value = total;
	   }
}
