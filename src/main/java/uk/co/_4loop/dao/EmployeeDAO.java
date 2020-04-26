package uk.co._4loop.dao;

import uk.co._4loop.model.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getEmployees();

    List<Employee> getEmployeeByID(int id);

    boolean saveEmployee(Employee employee);

    boolean updateEmployee(Employee employee);

    boolean deleteEmployee(Employee employee);
}
