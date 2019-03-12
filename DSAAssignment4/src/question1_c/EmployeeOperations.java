package question1_c;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EmployeeOperations {
    Map<Integer,Employee> listOfEmployee = new HashMap<Integer,Employee>();
   /**
    * add employee without duplicate id the duplicate Id is Encountered it is avoided
    * @param emp
    */
    public void addEmployee(Employee emp) {
        if(listOfEmployee.get(emp.getEmpId()) == null)
            listOfEmployee.put(emp.getEmpId(),emp);
    }
   /**
    * print the list of the employee
    */
    public void printList() {
       for(Employee emp:listOfEmployee.values())
            System.out.println(emp.toString());
        }
    }


