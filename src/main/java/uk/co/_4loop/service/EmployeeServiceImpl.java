package uk.co._4loop.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uk.co._4loop.dao.EmployeeDAO;
import uk.co._4loop.model.Employee;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    public final EmployeeDAO employeeDao;

    public EmployeeServiceImpl(EmployeeDAO employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeDao.getEmployees();
    }

    @Override
    public List<Employee> getEmployeeByID(int id) {
        return employeeDao.getEmployeeByID(id);
    }

    @Override
    public boolean saveEmployee(Employee employee) {
        return employeeDao.saveEmployee(employee);
    }

    @Override
    public boolean updateEmployee(Employee employee) {
        return employeeDao.updateEmployee(employee);
    }

    @Override
    public boolean deleteEmployee(Employee employee) {
        return employeeDao.deleteEmployee(employee);
    }

}
