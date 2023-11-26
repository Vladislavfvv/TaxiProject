import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Application {

    static String dateFormat = "dd.MM.yyyy";
    static DateTimeFormatter dateFormatter;
    static {
        dateFormatter = new
                DateTimeFormatterBuilder().parseCaseInsensitive().append(DateTimeFormatter.ofPattern(dateFormat)).toFormatter();
    }
    public Application(){}

    public static DateTimeFormatter getDateFormatter(){
        return dateFormatter;
    }

    public static String getDateFormatString(){
        return dateFormat;
    }
}
