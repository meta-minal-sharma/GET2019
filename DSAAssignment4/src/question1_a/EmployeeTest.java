package question1_a;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {
	/**
	 * add the employee and sorted the list on the basis of the Id
	 */
	@Test
	public void test() {EmployeeOperations ep = new EmployeeOperations();
	ep.addEmployee(new Employee(1, "Minal", "Udaipur"));
	ep.addEmployee(new Employee(5, "Saurabh", "Udaipur"));
	ep.addEmployee(new Employee(3, "Heena", "Udaipur"));
	ep.addEmployee(new Employee(4, "Madhuri", "Jodhpur"));
	ep.addEmployee(new Employee(2, "Vasim", "Jaipur"));
	ep.sortedList();
	ep.printList();
	}

}