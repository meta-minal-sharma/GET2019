package question1_c;
import java.util.Comparator;

public class Employee {
    int empId;
    String empName;
    String empAddress;
    
    public Employee(int empId, String empName, String empAddress) {
        super();
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
    public static Comparator<Employee> empid = new Comparator<Employee>() {

        public int compare(Employee s1, Employee s2) {

           String empName1 = s1.getEmpName();
           String empName2 = s2.getEmpName();

           /*For ascending order*/
           return empName1.compareTo(empName2);

           /*For descending order*/
           //rollno2-rollno1;
       }};

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + "]";
    }
       
}
