import java.util.Date;
import java.text.*;
public class DateTest {
    public static void main(String[] args){
        Date date=new Date();
        SimpleDateFormat ft=new SimpleDateFormat("E yyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println(ft.format(date));
    }
}
