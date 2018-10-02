package case1;

public class Evaluator {
private Evaluator() {
		
	
	}
	public static Evaluator evaluator;
	public static Evaluator getEvaluator() {
		if(evaluator==null){
			evaluator=new Evaluator();
		}
		return evaluator;
	}

	public String evaluate(Paper paper) {
		return "Pass";
	}

}
