package top.testops.others.classification;

import top.testops.others.TimeCard;
import top.testops.utils.DateUtils;

import java.sql.Timestamp;
import java.util.List;

/**
 * @author carson
 * @ClassName SalariedClassification
 * @Description TODO
 * @date 2020/4/23
 **/
public class HourlyClassification implements PaymentClassification {
    public int hourSalary;
    public List<TimeCard> timeCardList;

    public HourlyClassification(int hourSalary, List<TimeCard> timeCardList) {
        this.hourSalary = hourSalary;
        this.timeCardList = timeCardList;
    }


    @Override
    public double calculatePay(Timestamp date) {
        double salary = 0;
        for (int i = 0; i < timeCardList.size(); i++) {
            int hours = timeCardList.get(i).hours;
            int overTimeHours = 0;
            if (hours > 8) {
                overTimeHours = hours - 8;
                hours = 8;
            }
            salary = salary + overTimeHours * hourSalary * 1.5 + hours * hourSalary;
        }
        return salary;
    }
}
