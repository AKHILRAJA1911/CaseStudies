package case3;

public class Subject {
	private String title;
	private int fullMarks,obtainedMarks,labMarks,theoryMarks;
	
	public Subject() {
		fullMarks=100;
		title="";
		labMarks=0;
		theoryMarks=0;
		obtainedMarks=0;
	}
	
	public Subject(String title,int labMarks,int theoryMarks) {
		fullMarks=100;
		this.title=title;
		this.labMarks=labMarks;
		this.theoryMarks=theoryMarks;
		obtainedMarks=(int)Math.round(0.5*labMarks+0.5*theoryMarks);
	}
	
	private int calculateObtainedMarks() {
		return (int)Math.round(0.5*labMarks+0.5*theoryMarks);
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getFullMarks() {
		return fullMarks;
	}
	

	public int getLabMarks() {
		return labMarks;
	}


	public int getObtainedMarks() {
		return obtainedMarks;
	}

	public void setLabMarks(int labMarks) {
		this.labMarks = labMarks;
		obtainedMarks=calculateObtainedMarks();
	}


	public int getTheoryMarks() {
		return theoryMarks;
	}


	public void setTheoryMarks(int theoryMarks) {
		this.theoryMarks = theoryMarks;
		obtainedMarks=calculateObtainedMarks();
	}
	
}
