package packageFour;

public class Staff extends Person{
	
	int staffId;
	
	public Staff(String name, char gender, int staffId) {
		super(name, gender);
		this.staffId = staffId;
	}
	
	{
		System.out.println("I am the Child");
	}

	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	@Override
	public String toString() {
		return "Staff [staffId=" + staffId + ", name=" + name + ", gender=" + gender + ", getStaffId()=" + getStaffId()
				+ ", getName()=" + getName() + ", getGender()=" + getGender() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
