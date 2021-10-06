/* Morgan Harmon
 * Professor Stephan
 * CSE 271
 * 28 Feb. 2017
 */

// Creates a class, Student, with a major
public class Student extends Person {
	// Variable
	private String major;

	// Constructor
	public Student(String name, String dateOfBirth, String major) {
		super(name, dateOfBirth);
		this.major = major;
	}
	
	// toString method
	public void display() {
		super.display();
		System.out.print("Major: " + major + "\n");
		System.out.println("");
	}

	// Getter and Setter
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
}
