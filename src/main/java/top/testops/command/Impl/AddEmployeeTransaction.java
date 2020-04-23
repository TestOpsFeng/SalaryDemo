package top.testops.command.Impl;

import top.testops.dao.PayrollDatabase;
import top.testops.dao.Employee;
import top.testops.others.method.HoldMethod;
import top.testops.others.classification.PaymentClassification;
import top.testops.others.method.PaymentMethod;
import top.testops.others.schedule.PaymentSchedule;
import top.testops.command.Transaction;

/**
  * @ClassName AddEmployeeTransaction
  * @Description TODO
  * @author carson
  * @date 2020/4/23
**/
public abstract class AddEmployeeTransaction implements Transaction {
    private int id;
    private String name;
    private String address;

    public AddEmployeeTransaction(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    protected abstract PaymentClassification makeClassification();
    protected abstract PaymentSchedule makeSchedule();

    @Override
    public void execute() {
        PaymentClassification pc = makeClassification();
        PaymentSchedule ps = makeSchedule();
        PaymentMethod pm = new HoldMethod();
        Employee e = new Employee(id, name, address);
        e.classification = pc;
        e.schedule = ps;
        e.paymentMethod = pm;
        PayrollDatabase.addEmployee(e);
    }
}
