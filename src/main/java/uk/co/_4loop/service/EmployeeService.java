package uk.co._4loop.service;

import uk.co._4loop.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getEmployees();

    List<Employee> getEmployeeByID(int id);

    boolean saveEmployee(Employee employee);

    boolean updateEmployee(Employee employee);

    boolean deleteEmployee(Employee employee);
}
