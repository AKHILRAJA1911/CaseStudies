package case1;

public class Registrar {
	
	private Registrar() {
		
	}
	
	public static Registrar registrar;
	public static int roll=0;
	public static Registrar getRegister() {
		if(registrar==null)
		{registrar= new Registrar();}
		return registrar;
	}
	public String registerStudent(Student student) {

		String admissionId = null;

		System.out.println("Name: " + student.getStudentName());
		Validator validator = Validator.getValidator();
		if (validator.validateStudentDetails(student)) {
			roll++;
			admissionId = "STUDENT"+roll;
			return admissionId;
		}else{
			System.out.println("invalid student details");
			return null;
		}
		
	}
	

}
