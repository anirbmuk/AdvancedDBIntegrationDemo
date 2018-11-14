package blog.anirbanm.integ.viewmodel;

import java.io.Serializable;

import java.math.BigDecimal;

import java.sql.SQLData;
import java.sql.SQLException;
import java.sql.SQLInput;
import java.sql.SQLOutput;

public class Employee implements Serializable, SQLData {
    
    @SuppressWarnings("compatibility:-5647745320310718797")
    private static final long serialVersionUID = -4242073696682805675L;
    
    private String sqlType;
    private BigDecimal employeeId;
    private String firstName;
    private String lastName;

    public Employee() {
        this("EMP_TYPE");
    }
    
    public Employee(final String sqlType) {
        this.sqlType = sqlType;
    }
    
    public Employee(final BigDecimal employeeId, final String firstName, final String lastName) {
        this("EMP_TYPE");
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public Employee(final String sqlType, final BigDecimal employeeId, final String firstName, final String lastName) {
        this.sqlType = sqlType;
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Employee ["
            + employeeId + ", "
            + firstName + ", "
            + lastName + "]";
    }

    public void setSqlType(String sqlType) {
        this.sqlType = sqlType;
    }

    public String getSqlType() {
        return sqlType;
    }

    public void setEmployeeId(BigDecimal employeeId) {
        this.employeeId = employeeId;
    }

    public BigDecimal getEmployeeId() {
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

    @Override
    public String getSQLTypeName() throws SQLException {
        return getSqlType();
    }

    @Override
    public void readSQL(SQLInput sQLInput, String sqlType) throws SQLException {
        this.sqlType = sqlType;
        this.employeeId = sQLInput.readBigDecimal();
        this.firstName = sQLInput.readString();
        this.lastName = sQLInput.readString();
    }

    @Override
    public void writeSQL(SQLOutput sQLOutput) throws SQLException {
        sQLOutput.writeBigDecimal(this.employeeId);
        sQLOutput.writeString(this.firstName);
        sQLOutput.writeString(this.lastName);
    }
}
