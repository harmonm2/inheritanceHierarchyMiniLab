/* Morgan Harmon
 * Professor Stephan
 * CSE 271
 * 28 Feb. 2017
 */

// Creates a class, Person, with a name and date of birth
public class Person {
	// Variables
	private String name;
	private String dateOfBirth;

	// Constructor
	public Person(String name, String dateOfBirth) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

	// toString method
	public void display() {
		System.out.print("Name: " + name + "\nDate of Birth: " + dateOfBirth + "\n");
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;

	}
}
