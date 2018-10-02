package case4;

public class Paper {
	public String submit(){
		Evaluator evaluator=Evaluator.getEvaluator();
		return evaluator.evaluate(this);
	}
}