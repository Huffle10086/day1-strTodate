import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    Date toSimpleDate(String str) throws ParseException {
        Date date=null;
        String afterstr="";
        int len=0;
        for(int i=0;i<str.length();i++)
        {
            if(Character.isDigit(str.charAt(i))){
                afterstr=afterstr+str.charAt(i);
                len=0;
            }else if(!Character.isDigit(str.charAt(i))&&len==0){
                afterstr=afterstr+'-';
                len++;
            }
        }
        System.out.println(afterstr);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        date=sdf.parse(afterstr);
        return date;
    }
}


