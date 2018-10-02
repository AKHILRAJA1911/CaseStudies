package case2;


	
	import java.util.ArrayList;
	import java.util.Calendar;
	import java.util.Date;
	public class Student {
		String name,maritalStatus,sex,address,pEmail,sEmail,phone,hEduQual,nationality,admissionId,result;
		Date dob;
		Exam exam;
		int age;
		Registrar registrar;
		ExamRegistrar examRegistrar;
		Subject subject;
		
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
		
		Student(ArrayList<Object> creds){
			name=(String)creds.get(0);
			maritalStatus=(String)creds.get(1);
			sex=(String)creds.get(2);
			address=(String)creds.get(3);
			pEmail=(String)creds.get(4);
			sEmail=(String)creds.get(5);
			phone=(String)creds.get(6);
			hEduQual=(String)creds.get(7);
			nationality=(String)creds.get(8);
			admissionId=(String)creds.get(9);
			result=(String)creds.get(10);
			dob=(Date)creds.get(11);
			long longAge=new Date().getTime()-((Date)creds.get(13)).getTime();
			Date tempDate=new Date(longAge);
			Calendar tempCal=Calendar.getInstance();
			tempCal.setTime(tempDate);
			age=tempCal.get(Calendar.YEAR)-1970;
		}
		public void setAdmissionId(String admissionId) {
			this.admissionId = admissionId;
		}
		public void registerStudent(){
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



