package blog.anirbanm.integ.viewmodel;

import java.io.Serializable;

public class Employee implements Serializable {
    
    @SuppressWarnings("compatibility:-5647745320310718797")
    private static final long serialVersionUID = -4242073696682805675L;
    
    private Integer employeeId;
    private String firstName;
    private String lastName;

    public Employee() {
        this(100, "New", "Employee");
    }
    
    public Employee(final Integer employeeId, final String firstName, final String lastName) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Employee [employeeId -> "
            + employeeId + ", firstName -> "
            + firstName + ", lastName -> "
            + lastName + "]";
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
}
