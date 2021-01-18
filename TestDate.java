import java.text.ParseException;
import java.util.Date;

public class TestDate {
    public static void main(String[] args) throws ParseException {
        DateUtils dateUtils=new DateUtils();
        String str="2020--01--22";
        System.out.println(dateUtils.toSimpleDate(str));
    }
}
