/* Morgan Harmon
 * Professor Stephan
 * CSE 271
 * 28 Feb. 2017
 */

// Program to test the different classes
public class TesterPart1 {

	public static void main(String[] args) {
		Person person = new Person("Morgan", "September 2nd, 1997");
		person.display();
		System.out.println("");

		Student student = new Student("Morgan", "September 2nd, 1997", "Computer Engineering");
		student.display();

		Instructor instructor = new Instructor("Morgan", "September 2nd, 1997", 10000000);
		instructor.display();
	}

}
