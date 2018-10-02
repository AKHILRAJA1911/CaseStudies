package case4;
import java.util.Set;
import java.util.HashSet;



public class Registrar implements Runnable{
	private static Registrar registrar1=null;
	private static Registrar registrar2=null;
	private static Registrar registrar3=null;
	private static Registrar registrar4=null;
	private static Registrar registrar5=null;
	private static int seats=30;
	private static int regC=1;
	static Set<String> admissionIDs=new HashSet<>();
	private Student student;
	private Registrar(){
	}
	
	@Override
	public void run(){
		try{
			this.registerStudent(student);
		}
		catch(RegistrationException e){
			System.out.println(e.toString());
			System.exit(-1);
		}
	}
	
	public static int getSeats() {
		return seats;
	}

	public static Registrar getRegistrar(){
		if(registrar1==null) return new Registrar();
		else if(registrar2==null) return new Registrar();
		else if(registrar3==null) return new Registrar();
		else if(registrar4==null) return new Registrar();
		else if(registrar5==null) return new Registrar();
		else{
			if(regC==1){regC++; return registrar1;}
			if(regC==2){regC++; return registrar1;}
			if(regC==3){regC++; return registrar1;}
			if(regC==4){regC++; return registrar1;}
		}
		regC=1;
		return registrar5;
	}
	public synchronized void registerStudent(Student student)throws RegistrationException{
		Validator validator=Validator.getValidator();
		try{
			validator.validateStudentDetails(student);
			if(student.isValidated()) {
				String sCode=student.getSubject().getTitle().toUpperCase().substring(0,3);
				if(seats>0){
					int c=1;
					while(true){
						String genID=sCode+String.format("%5d", c);
						if(!admissionIDs.contains(genID)){
							student.setAdmissionId(genID);
							admissionIDs.add(genID);
							seats--;
							break;
						}
						c++;
					}
				}
				else throw new RegistrationException("Insufficient seats");
			}
			else throw new RegistrationException("Insufficient seats");
		}
		catch(AgeException e){
			System.out.println(e.toString());
		}
	}

	public void setStudent(Student student) {
		this.student = student;
	}
}