import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        printDate();
    }
    public static void printDate() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String dataLong = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println(dataLong);
    }
}