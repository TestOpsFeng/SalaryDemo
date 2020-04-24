package top.testops.dao;

import top.testops.command.Payday;
import top.testops.others.classification.PaymentClassification;
import top.testops.others.method.PaymentMethod;
import top.testops.others.schedule.PaymentSchedule;

/**
  * @ClassName Employee
  * @Description TODO
  * @author carson
  * @date 2020/4/22
**/
public class Employee {
    public int id;
    public String name;
    public  String address;
    public int salary;
    public PaymentClassification classification;
    public PaymentSchedule schedule ;
    public PaymentMethod paymentMethod;

    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Employee(int id, String name, String address, int salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }
}
