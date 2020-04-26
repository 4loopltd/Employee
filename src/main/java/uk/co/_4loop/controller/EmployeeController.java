package uk.co._4loop.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uk.co._4loop.model.Employee;
import uk.co._4loop.service.EmployeeService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/api")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @SuppressWarnings("SameReturnValue")
    @GetMapping("ping")
    public String ping() {
        return "Hello";
    }

    @GetMapping("employees")
    public List<Employee> allEmployees() {
        return employeeService.getEmployees();
    }

    @GetMapping("employee/{id}")
    public List<Employee> allEmployeeByID(@PathVariable("id") int id) {
        return employeeService.getEmployeeByID(id);
    }

    @PostMapping("create")
    public boolean saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @PostMapping("update/{id}")
    public boolean updateEmployee(@PathVariable("id") int id, @RequestBody Employee employee) {
        employee.setId(id);
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("delete/{id}")
    public boolean deleteEmployee(@PathVariable("id") int id, Employee employee) {
        employee.setId(id);
        return employeeService.deleteEmployee(employee);
    }


}