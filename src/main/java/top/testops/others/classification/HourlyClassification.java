package top.testops.others.classification;

import top.testops.others.TimeCard;
import top.testops.utils.DateUtils;

import java.sql.Timestamp;

/**
 * @author carson
 * @ClassName SalariedClassification
 * @Description TODO
 * @date 2020/4/23
 **/
public class HourlyClassification implements PaymentClassification {
    public int hourSalary;
    public TimeCard timeCard;

    public HourlyClassification(int hourSalary, TimeCard timeCard) {
        this.hourSalary = hourSalary;
        this.timeCard = timeCard;
    }

    public Timestamp getDate(){
        return timeCard.date;
    }

    public int getHours(){
        return timeCard.hours;
    }

    @Override
    public int calculatePay(Timestamp date) {
        if (date.getDate() == DateUtils.getLastDateOfMonth(2020,4)){
        }
        return 0;
    }
}
