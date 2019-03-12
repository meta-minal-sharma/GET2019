package question1_b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeOperations {
    List<Employee> listOfEmployee = new ArrayList<Employee>();
    /**
     * add the employee in the list
     * @param emp
     */
    public void addEmployee(Employee emp) {
        listOfEmployee.add(emp);  
    }
    /**
     * sorting of the employee on the basis of empName
     */
    public void sortEmployeeByName() {
        Collections.sort(listOfEmployee,Employee.empid);
    }
    /**
     * print the list of Employee
     */
    public void printList() {
        for(int i =0;i<listOfEmployee.size();i++) {
            System.out.println(listOfEmployee.get(i).toString());
        }
    }

}
