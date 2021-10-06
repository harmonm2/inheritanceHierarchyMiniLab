/* Morgan Harmon
 * Professor Stephan
 * CSE 271
 * 28 Feb. 2017
 */

// Creates a class, Instructor, with a salary
public class Instructor extends Person {

	// Variable
	private int salary;

	// Constructor
	public Instructor(String name, String dateOfBirth, int salary) {
		super(name, dateOfBirth);
		this.salary = salary;
	}
	
	// toString method
	public void display(){
		super.display();
		System.out.print("Salary: " + salary + "\n");
		System.out.println("");
	}

	// Getter and Setter
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
