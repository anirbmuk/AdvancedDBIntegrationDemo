package blog.anirbanm.integ.view.bean;

import blog.anirbanm.integ.view.ADFUtils;
import blog.anirbanm.integ.viewmodel.Employee;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ActionEvent;

import oracle.binding.OperationBinding;

public class IntegrationManager {
    
    public IntegrationManager() {
    }

    public void execute(final ActionEvent actionEvent) {
        final ArrayList<Employee> employees = getEmployees();
        final OperationBinding updateEmployees = ADFUtils.findOperation("updateEmployees");
        updateEmployees.getParamsMap().put("employees", employees);
        System.out.println("OUT param: " + (List<Employee>) updateEmployees.execute());
    }
                  
    private ArrayList<Employee> getEmployees() {
        final ArrayList<Employee> employees = new ArrayList<Employee>();
        
        final Employee employee1 = new Employee();
        employee1.setEmployeeId(new BigDecimal(100));
        employee1.setFirstName("Stevie");
        employee1.setLastName("Wonder");
        employees.add(employee1);
        
        final Employee employee2 = new Employee();
        employee2.setEmployeeId(new BigDecimal(110));
        employee2.setFirstName("Frank");
        employee2.setLastName("Ross");        
        employees.add(employee2);
        
        return employees;
    }
}
