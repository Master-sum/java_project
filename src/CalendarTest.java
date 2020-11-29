import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalendarTest {
    public static void main(String[] args){
//        获取当前时间
        LocalDate T = LocalDate.now();
        System.out.println(T.getDayOfWeek().getValue());
//        获取当前月
        int m = T.getMonthValue();
//        获取当前的日期
        int d = T.getDayOfMonth();
//        当前日期 - 已过去的天数（today - 1）
        T = T.minusDays(m-1);
        System.out.println(T.getDayOfWeek().getValue());
        DayOfWeek weekday = T.getDayOfWeek();
        System.out.println(T.getDayOfWeek().getValue());

//        获取星期几
        int Value = weekday.getValue();
        System.out.println(Value);
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");

        for (int i=1;i<Value;i++)
            System.out.println(" ");
        while (T.getMonthValue() == m)
        {
            System.out.printf("%3d",T.getDayOfMonth());
            if (T.getDayOfMonth() == d)
                System.out.print("*");
            else
                System.out.print(" ");
            T = T.plusDays(1);
            if (T.getDayOfWeek().getValue() == 1) System.out.println();

        }
        if (T.getDayOfWeek().getValue() != 1) System.out.println();
    }

}
