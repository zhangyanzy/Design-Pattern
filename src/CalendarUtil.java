import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarUtil {

    /**
     * 获取明天的时刻
     */
    public static Calendar getNextDay(Calendar calendar) {
        calendar.add(Calendar.DAY_OF_YEAR, +1);
        return calendar;
    }


    public static String getNowTime(String dateformat) {
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat(dateformat);// 可以方便地修改日期格式
        String hehe = dateFormat.format(now);
        return hehe;
    }


    public static Long getAfterOneHour(Calendar calendar) {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        calendar.add(Calendar.HOUR, 1);
        long timeInMillis = calendar.getTimeInMillis()/1000;
        return timeInMillis;
    }
}
