/* Morgan Harmon
 * Professor Stephan
 * CSE 271
 * 28 Feb. 2017
 */

// Creates a class, Person,
public class Manager extends Employee {
	// Variables
	private String department;
	
	// Constructor
	public Manager(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}
	
	// toString method override
	public void display(){
		super.display();
		System.out.print("Department: " + department + "\n");
	}

	// Getter and Setter
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
}
