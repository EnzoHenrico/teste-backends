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
            System.out.println("String to Date convert Exception: " + timeError);
        }
    }

    public void addToProposal(String value) {
        
    }

    public Date stringToDate(String stringDate) throws ParseException {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        Date date = formatter.parse(stringDate);

        return date;
    }
}
