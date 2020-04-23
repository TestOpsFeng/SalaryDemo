package top.testops.others.schedule;

import java.sql.Timestamp;

/**
  * @ClassName MonthlySchedule
  * @Description TODO
  * @author carson
  * @date 2020/4/23
**/
public class MonthlySchedule  implements PaymentSchedule{
    @Override
    public boolean isPayday(Timestamp date) {
        if( date.getDate() == 30){
            return true;
        }
        return false;
    }
}
