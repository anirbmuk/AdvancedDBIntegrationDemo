package blog.anirbanm.integ.model.am.common;

import blog.anirbanm.integ.viewmodel.Employee;

import java.util.List;

import oracle.jbo.ApplicationModule;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Nov 06 12:21:23 IST 2018
// ---------------------------------------------------------------------
public interface IntegrationModule extends ApplicationModule {
    List<Employee> updateEmployees(List<Employee> employees);
}

