package top.testops.command.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import top.testops.command.Transaction;
import top.testops.dao.EmployeeDao;
import top.testops.dao.been.Employee;

/**
  * @ClassName AddSalariedEmployee
  * @Description TODO
  * @author carson
  * @date 2020/4/22
**/

@Controller
public class AddSalariedEmployee implements Transaction {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public void execute() {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Bob");
        employee.setAddress("Home");
        employee.setSalary(1000);
        employeeDao.saveEmployee(employee);
    }
}
