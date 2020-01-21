
package packageFour;

public class Person {
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + "]";
	}

	protected String name;
	
	public char gender;
	
	private Person(String name, char gender) {
		this.name = name;
		this.gender = gender;
	}
	
	{
		System.out.println("I am the Parent");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
}
