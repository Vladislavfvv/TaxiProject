package interfaces;

import java.time.format.DateTimeFormatter;

public interface DataValidatable {
    boolean isValid(String dateStr, DateTimeFormatter dateTimeFormatter);
}
