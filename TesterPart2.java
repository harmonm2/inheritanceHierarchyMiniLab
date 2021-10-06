
public class TesterPart2 {
	public static void main(String args[]) {
		Employee employ = new Employee("Morgan", 10000000);
		employ.display();
		System.out.println(" ");

		Manager manager = new Manager("Morgan", 10000000, "Office 123");
		manager.display();
		System.out.println(" ");

		Executive exec = new Executive("Morgan", 10000000, "Office 123", "123 Place, Place");
		exec.display();
		System.out.println(" ");

	}
}
