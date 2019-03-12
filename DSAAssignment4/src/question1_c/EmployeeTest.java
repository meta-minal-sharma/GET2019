package question1_c;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {
	/**
	 * test duplicacy on the basis of the Id
	 */
	@Test
	public void avoidDuplicateEmptest() {
	EmployeeOperations ep = new EmployeeOperations();
	ep.addEmployee(new Employee(1, "Minal", "Udaipur"));
	ep.addEmployee(new Employee(1, "Saurabh", "Udaipur"));
	ep.addEmployee(new Employee(3, "Heena", "Udaipur"));
	ep.addEmployee(new Employee(4, "Madhuri", "Jodhpur"));
	ep.addEmployee(new Employee(2, "Vasim", "Jaipur"));
	ep.printList();
	}

}

