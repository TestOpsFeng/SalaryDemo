package top.testops.operations;

import top.testops.command.Impl.AddEmployeeTransaction;
import top.testops.others.TimeCard;
import top.testops.others.classification.HourlyClassification;
import top.testops.others.classification.PaymentClassification;
import top.testops.others.classification.SalariedClassification;
import top.testops.others.schedule.MonthlySchedule;
import top.testops.others.schedule.PaymentSchedule;
import top.testops.others.schedule.WeeklySchedule;

/**
  * @ClassName AddSalaryEmployee
  * @Description TODO
  * @author carson
  * @date 2020/4/23
**/
public class AddHourlyEmployeeTransaction extends AddEmployeeTransaction {
    private int hourSalary;
    private TimeCard timeCard;

    public AddHourlyEmployeeTransaction(int id, String name, String address, int hourSalary,TimeCard timeCard) {
        super(id, name, address);
        this.hourSalary = hourSalary;
        this.timeCard = timeCard;
    }

    @Override
    protected PaymentClassification makeClassification() {
        return  new HourlyClassification(hourSalary,timeCard);
    }

    @Override
    protected PaymentSchedule makeSchedule() {
        return new WeeklySchedule();
    }
}
