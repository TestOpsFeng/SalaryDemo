package top.testops.others.schedule;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author carson
 * @ClassName MonthlySchedule
 * @Description TODO
 * @date 2020/4/23
 **/
public class BlweeklySchedule implements PaymentSchedule {


    @Override
    public boolean isPayday(Timestamp date) {
        if (date.getDate() == 30) {
            return true;
        }
        return false;
    }
}
