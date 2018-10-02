package case1;

public class Student {

	private String age;
	private String maritalStatus;
	private String sex;
	private String dob;
	private String pemail;
	private String semail;
	private String phone;
	private String education;
	private String nationality;
	private String admissionId;
	private String studentName;
	private String result;
	private Exam exam;
	
	public Student(){
		
	}
	public Student(String maritalStatus, String age, String sex, String dob, String pemail, String semail,String phone, String education, String nationality,  String studentName) {
		super();
		this.maritalStatus = maritalStatus;
		this.age = age;
		this.sex = sex;
		this.dob = dob;
		this.pemail = pemail;
		this.semail = semail;
		this.phone = phone;
		this.education = education;
		this.nationality = nationality;
		
		this.studentName = studentName;
		
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPemailId() {
		return pemail;
	}
	public void setPemail(String pemail) {
		this.pemail = pemail;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getAdmissionId() {
		return admissionId;
	}
	public void setAdmissionId(String admissionId) {
		this.admissionId = admissionId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public Exam getExam() {
		return exam;
	}
	public void setExam(Exam exam) {
		this.exam = exam;
	}
	
	public void registerStudent() {
		Registrar registrar = Registrar.getRegister();
		admissionId = registrar.registerStudent(this);
		System.out.println("Id: " + admissionId);

	}
	public void registerForExam() {
		ExamRegistrar examRegistrar = ExamRegistrar.getExamregister();
		exam = examRegistrar.registeringStudentForExamination(this);
	}
	public void apperForExam() {
		Paper paper = exam.getPaper();
		
		result = paper.submit();
	}

}
