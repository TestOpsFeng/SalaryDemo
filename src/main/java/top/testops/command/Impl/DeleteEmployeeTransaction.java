package top.testops.command.Impl;

import top.testops.command.Impl.AddEmployeeTransaction;
import top.testops.command.Transaction;
import top.testops.dao.PayrollDatabase;
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
public class DeleteEmployeeTransaction implements Transaction {
    private int id;

    public DeleteEmployeeTransaction(int id) {
        this.id = id;
    }
    @Override
    public void execute() {
        PayrollDatabase.delEmployee(id);
    }
}
