package top.testops.others.schedule;

import java.sql.Timestamp;

/**
  * @ClassName PaymentSchedule
  * @Description TODO
  * @author carson
  * @date 2020/4/23
**/
public interface PaymentSchedule {
    boolean isPayday(Timestamp date);
}
