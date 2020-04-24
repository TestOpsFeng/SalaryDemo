package top.testops.others.schedule;

import top.testops.utils.DateUtils;

import java.sql.Timestamp;

/**
 * @author carson
 * @ClassName MonthlySchedule
 * @Description TODO
 * @date 2020/4/23
 **/
public class WeeklySchedule implements PaymentSchedule {
    @Override
    public boolean isPayday(Timestamp date) {
        return date.getDate() == DateUtils.getLastDateOfMonth(date.getYear(), date.getMonth());
    }
}
