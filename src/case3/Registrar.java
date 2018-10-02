package case3;
import java.util.Set;
import java.util.HashSet;


public class Registrar {
	static Registrar registrar=null;
	static Set<String> admissionIDs=new HashSet<>();
	private Registrar(){
	}
	public static Registrar getRegistrar(){
		if(registrar==null) return new Registrar();
		return registrar;
	}
	public void registerStudent(Student student)throws RegistrationException{
		Validator validator=Validator.getValidator();
		try{
			if(validator.validateStudentDetails(student)) {
				String sCode=student.getSubject().getTitle().toUpperCase().substring(0,3);
				int c=1;
				while(true){
					String genID=sCode+String.format("%5d", c);
					if(!admissionIDs.contains(genID)){
						student.setAdmissionId(genID);
						admissionIDs.add(genID);
						break;
					}
					c++;
				}
			}
		}
		catch(UniversityException e){
			System.out.println(e.toString());
		}
	}
}
