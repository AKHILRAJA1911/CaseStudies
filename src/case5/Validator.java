package case5;

public class Validator implements Runnable{
	private static Validator validator1=null;
	private static Validator validator2=null;
	private static Validator validator3=null;
	private static Validator validator4=null;
	private static Validator validator5=null;
	private static int valC=1;
	private Student student;
	
	@Override
	public void run(){
		try {
			if(validateStudentDetails(student)){
				student.setValidated(true);
			}
		} catch (ValidationException e) {
			System.out.println(e.toString());
			student.setValidated(false);
		}
	}

	private Validator(){
		
	}
	static Validator getValidator(){
		if(validator1==null) return new Validator();
		else if(validator2==null) return new Validator();
		else if(validator3==null) return new Validator();
		else if(validator4==null) return new Validator();
		else if(validator5==null) return new Validator();
		else{
			if(valC==1){valC++; return validator1;}
			if(valC==2){valC++; return validator1;}
			if(valC==3){valC++; return validator1;}
			if(valC==4){valC++; return validator1;}
		}
		valC=1;
		return validator5;
	}
	public synchronized boolean validateStudentDetails(Student student)throws ValidationException{
		if(Registrar.getSeats()<0) return false;
		if(!(student.getAge()<23&&student.getAge()<35)) throw new AgeException("Age not within limit");
		return true;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
}