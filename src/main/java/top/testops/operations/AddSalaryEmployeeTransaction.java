package top.testops.operations;

import top.testops.command.Impl.AddEmployeeTransaction;
import top.testops.others.classification.PaymentClassification;
import top.testops.others.classification.SalariedClassification;
import top.testops.others.schedule.MonthlySchedule;
import top.testops.others.schedule.PaymentSchedule;

/**
  * @ClassName AddSalaryEmployee
  * @Description TODO
  * @author carson
  * @date 2020/4/23
**/
public class AddSalaryEmployeeTransaction extends AddEmployeeTransaction {
    private int salary;

    public AddSalaryEmployeeTransaction(int id, String name, String address, int salary) {
        super(id, name, address);
        this.salary = salary;
    }

    @Override
    protected PaymentClassification makeClassification() {
        return  new SalariedClassification(salary);
    }

    @Override
    protected PaymentSchedule makeSchedule() {
        return new MonthlySchedule();
    }
}
