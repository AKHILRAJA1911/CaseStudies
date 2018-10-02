package case1;

public class Test {
	public static void main(String[] args) {
		Student std = new Student();
		
		std.setMaritalStatus("Single");
		std.setAge("24");
		std.setSex("Male");
		std.setDob("12-12-1993");
		std.setPemail("akhilraja1911@gmail.com");
		std.setSemail("akhil_raja@yahoo.com");
		std.setPhone("9666007707");
		std.setEducation("B.tech");
		std.setNationality("Indian");
		std.setStudentName("Akhil Raja");

		
		
		std.registerStudent();
		std.registerForExam();
		std.apperForExam();
		System.out.println("Result: " + std.getResult());

	}

}
