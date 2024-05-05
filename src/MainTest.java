import org.junit.jupiter.api.Test;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testDateFormat() {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String dateFormatter = date.format(formatter);
        assertEquals("01 marzo 2023", dateFormatter, "Date format wrong");
    }

    @Test
    public void testDateAnalysis() {
        OffsetDateTime expectedDateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime actualDateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        assertEquals(expectedDateTime, actualDateTime, "Date analisys wrong");
    }

    @Test
    public void testDateEquality () {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String expectedVideoDateTime = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        String actualVideoDateTime = "1 marzo 2023";
        assertEquals(expectedVideoDateTime, actualVideoDateTime, "Expected date wrong");
    }
}