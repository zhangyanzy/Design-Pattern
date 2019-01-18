import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        long timeInMillis = calendar.getTimeInMillis() / 1000;
        long afterOneHour = CalendarUtil.getAfterOneHour(calendar);

        System.out.println("今天日期:" + timeInMillis);
        System.out.println("一小时后:"+afterOneHour);

        calendar.setTime(calendar.getTime());
        calendar.add(Calendar.DAY_OF_MONTH, 1);//天
        calendar.set(Calendar.HOUR_OF_DAY, 1);//小时
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        System.out.println("明天整点：" + calendar.getTimeInMillis()/1000);

        calendar.setTime(new Date());
        calendar.add(Calendar.DAY_OF_MONTH, 2);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        System.out.println("后天整点：" + calendar.getTimeInMillis()/1000);






    }

//    //获取当天（按当前传入的时区）00:00:00所对应时刻的long型值
//    public static long getStartTimeOfDay(long now) {
//        TimeZone curTimeZone = TimeZone.getTimeZone("GMT+8");
//        Calendar calendar = Calendar.getInstance(curTimeZone);
//        calendar.setTimeInMillis(now);
//        calendar.set(Calendar.HOUR_OF_DAY, 0);
//        calendar.set(Calendar.MINUTE, 0);
//        calendar.set(Calendar.SECOND, 0);
//        calendar.set(Calendar.MILLISECOND, 0);
//        return calendar.getTimeInMillis / 1000 ();
//    }


}
