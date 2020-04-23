package top.testops.dao;

import java.util.Hashtable;

/**
 * @author carson
 * @ClassName PayrollDatabase
 * @Description TODO
 * @date 2020/4/23
 **/
public class PayrollDatabase {
    private static Hashtable employees = new Hashtable();

    public static void addEmployee(Employee employee) {
        employees.put(employee.id,employee);
    }
    public static Employee getEmployee(int id){
        return (Employee) employees.get(id);
    }
    public static Employee delEmployee(int id){
        return (Employee) employees.remove(id);
    }
}
