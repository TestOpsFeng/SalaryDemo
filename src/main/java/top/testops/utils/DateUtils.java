package top.testops.utils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
  * @ClassName DateUtils
  * @Description TODO
  * @author carson
  * @date 2020/4/23
**/
public class DateUtils {
    public static Timestamp string2Timestamp(String dateStr) {
        return Timestamp.valueOf(dateStr);
    }

    public static String timestamp2String(Timestamp timestamp) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(timestamp);
    }
    public static int getLastDateOfMonth(int year,int month) {
        int week = 0;
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1);
        //获取该月最大一天
        int lastDay = cal.getActualMaximum(Calendar.DATE);
        cal.set(Calendar.DAY_OF_MONTH, lastDay);
        //获得最后一天是星期几
        week = cal.get(Calendar.DAY_OF_WEEK) - 1 == 0 ? 7 : cal.get(Calendar.DAY_OF_WEEK) - 1;
        if (week == 7) {
            lastDay = lastDay - 2;
        } else if (week == 6) {
            lastDay = lastDay - 1;
        }
        System.out.println(month + "月最后一天为： " + lastDay + " 号");
        return lastDay;
    }

    public static void main(String[] args) {
        getLastDateOfMonth(2020,5);
    }
}
