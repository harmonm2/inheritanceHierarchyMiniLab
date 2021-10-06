/* Morgan Harmon
 * Professor Stephan
 * CSE 271
 * 28 Feb. 2017
 */

// Creates a class, Employee, with a name and salary
public class Employee {
	// Variables
	private String name;
	private int salary;

	// Constructor
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	// toString method
	public void display() {
		System.out.print("Name : " + name + "\nSalary: " + salary + "\n");
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
