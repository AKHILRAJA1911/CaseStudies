package case2;


public class Registrar {
	static Registrar registrar=null;
	private Registrar(){
	}
	public static Registrar getRegistrar(){
		if(registrar==null) return new Registrar();
		return registrar;
	}
	public void registerStudent(Student student){
		Validator validator=Validator.getValidator();
		if(validator.validateStudentDetails(student)) student.setAdmissionId("ID");
	}
}
