package case1;

public class ExamRegistrar {

private ExamRegistrar() {
		
	}

	public static ExamRegistrar examRegistrar;
	public static ExamRegistrar getExamregister() {
		if(examRegistrar==null){
			examRegistrar=new ExamRegistrar();
		}
		return  examRegistrar;
	}

	public Exam registeringStudentForExamination(Student student) {
		Paper paper = new Paper();
		Exam exam = new Exam(paper);
		return exam;

	}

	
}
