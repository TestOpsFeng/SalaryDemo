package top.testops.others;

import java.sql.Timestamp;
import java.util.Date;

/**
  * @ClassName TimeCard
  * @Description TODO
  * @author carson
  * @date 2020/4/23
**/
public class TimeCard {
    public int eid;
    public Timestamp date;
    public int hours;

    public TimeCard(int eid, Timestamp date, int hours) {
        this.eid = eid;
        this.date = date;
        this.hours = hours;
    }
}
