import java.text.ParseException;

public class TestDate {
    public static void main(String[] args) throws ParseException {
        DateUtils dateUtils=new DateUtils();
        String str="2020--01--22";
        System.out.println(dateUtils.toSimpleDate(str));
    }
}
