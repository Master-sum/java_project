import java.time.LocalDate;
import java.util.Date;

public class oop_01 {
    public static void main(String[] args){
//        构建时间对象
        Date u =new Date();
        String p = new Date().toString();
        System.out.println(u);
        System.out.println(p);
        LocalDate.now();
        LocalDate o = LocalDate.of(1999,1,1);
        LocalDate d = o.plusDays(1000);
        int y = d.getYear();
        System.out.println(y);
    }

}

