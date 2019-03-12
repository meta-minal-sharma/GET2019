package question1_a;
public class Employee implements Comparable<Employee> {
	int empId;
	String empName;
	String empAddress;

	public Employee(int empId, String empName, String empAddress) {
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getempAddress() {
		return empAddress;
	}

	public void setEmpAdresses(String empAddress) {
		this.empAddress = empAddress;
	}
	/**
	 * sorting of employee on the basis of the Id using the comparable 
	 */
	@Override
	public int compareTo(Employee emp) {
		int empId=((Employee)emp).getEmpId();
		/* For Ascending order*/
		return this.empId-empId;


	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + "]";
	}



}
