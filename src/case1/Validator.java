package case1;

public class Validator {
	
private Validator() {
		
	}
	
	public static Validator validator;
	public static Validator getValidator() {
		if(validator==null){
		validator= new Validator();}
		return validator;
	}

	public boolean validateStudentDetails(Student student) {

		if (student.getStudentName() != null) {
			return true;
		}

		return false;
	}

	

}
