package packageTwo;

import packageFour.Person;

public class Student extends Person{
	
	private String studentId;
	
	int squadNo;

	public Student(String name, char gender, String studentId, int squadNo) {
		super(name, gender);
		this.studentId = studentId;
		this.squadNo = squadNo;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public int getSquadNo() {
		return squadNo;
	}

	public void setSquadNo(int squadNo) {
		this.squadNo = squadNo;
	}

}
