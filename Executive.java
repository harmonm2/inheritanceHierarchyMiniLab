/* Morgan Harmon
 * Professor Stephan
 * CSE 271
 * 28 Feb. 2017
 */

// Creates a class, Person,
public class Executive extends Manager {
	// Variables
	private String officeLocation;

	// Constructor
	public Executive(String name, int salary, String department, String officeLocation) {
		super(name, salary, department);
		this.officeLocation = officeLocation;
	}

	// toString method
	public void display() {
		super.display();
		System.out.print("Office Location: " + officeLocation + "\n");
	}

	// Getter and setter
	public String getOfficeLocation() {
		return officeLocation;
	}

	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}
}
