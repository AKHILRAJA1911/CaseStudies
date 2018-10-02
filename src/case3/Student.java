package case3;
import java.util.Calendar;
import java.util.Date;
public class Student {
	private String name,maritalStatus,sex,address,pEmail,sEmail,phone,hEduQual,nationality,admissionId,result;
	private Date dob;
	private Exam exam;
	private int age;
	private Registrar registrar;
	private ExamRegistrar examRegistrar;
	private Subject subject;
	
	public String getName() {
		return name;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public String getSex() {
		return sex;
	}
	public String getAddress() {
		return address;
	}
	public String getpEmail() {
		return pEmail;
	}
	public String getsEmail() {
		return sEmail;
	}
	public String getPhone() {
		return phone;
	}
	public String gethEduQual() {
		return hEduQual;
	}
	public String getNationality() {
		return nationality;
	}
	public String getAdmissionId() {
		return admissionId;
	}
	public String getResult() {
		return result;
	}
	public Date getDob() {
		return dob;
	}
	public int getAge() {
		return age;
	}
	
	public Subject getSubject() {
		return subject;
	}
	Student(RegistrationForm registrationForm){
		name=registrationForm.getName();
		maritalStatus=registrationForm.getMaritalStatus();
		sex=registrationForm.getSex();
		address=registrationForm.getAddress();
		pEmail=registrationForm.getpEmail();
		sEmail=registrationForm.getsEmail();
		phone=registrationForm.getpNo();
		hEduQual=registrationForm.gethEdu();
		nationality=registrationForm.getNat();
		dob=registrationForm.getDob();
		long longAge=new Date().getTime()-dob.getTime();
		Date tempDate=new Date(longAge);
		Calendar tempCal=Calendar.getInstance();
		tempCal.setTime(tempDate);
		age=tempCal.get(Calendar.YEAR)-1970;
		subject=new Subject();
		subject.setTitle(registrationForm.getiSub());
	}
	public void setAdmissionId(String admissionId) {
		this.admissionId = admissionId;
	}
	public void registerStudent()throws UniversityException{
		registrar=Registrar.getRegistrar();
		registrar.registerStudent(this);
	}
	public void registerForExam(){
		examRegistrar=ExamRegistrar.getExamregistrar();
		exam=examRegistrar.registeringStudentForExamination(this);
	}
	public void appearForExam(){
		Paper paper=exam.getPaper();
		paper.submit();
	}
}
