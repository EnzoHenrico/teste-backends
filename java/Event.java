import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Event {

    public String eventId;
    public String eventAction;
    public Date eventTime;

    public Event(String eventId, String eventAction, String eventTime) {

        this.eventId = eventId;
        this.eventAction = eventAction;
        try {
            this.eventTime = this.stringToDate(eventTime);

        } catch (ParseException timeError) {
            System.out.println("Stringo to Date convert Exception: " + timeError);
        }
    }

    public Date stringToDate(String stringDate) throws ParseException {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        Date date = formatter.parse(stringDate);

        return date;
    }

    // Tests
    public String toString() {
        StringBuilder result = new StringBuilder();
        String newLine = System.getProperty("line.separator");

        result.append(this.getClass().getName());
        result.append(" Object {");
        result.append(newLine);

        // determine fields declared in this class only (no fields of superclass)
        Field[] fields = this.getClass().getDeclaredFields();

        // print field names paired with their values
        for (Field field : fields) {
            result.append("  ");
            try {
                result.append(field.getName());
                result.append(": ");
                // requires access to private field:
                result.append(field.get(this));
            } catch (IllegalAccessException ex) {
                System.out.println(ex);
            }
            result.append(newLine);
        }
        result.append("}");

        return result.toString();
    }
}
