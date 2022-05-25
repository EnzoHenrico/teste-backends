public class Proponent extends Event {

    public String proponentId;
    public String proponentName;
    public Integer proponentAge;
    public Float proponentMonthlyIncome;
    public Boolean proponentIsMain;

    public Proponent(String eventId, String eventAction, String eventTime, String proponentId, String proponentName,
            String proponentAge, String proponentMonthlyIncome, String proponentIsMain) {

        super(eventId, eventAction, eventTime);

        this.proponentId = proponentId;
        this.proponentName = proponentName;
        this.proponentAge = Integer.parseInt(proponentAge);
        this.proponentMonthlyIncome = Float.parseFloat(proponentMonthlyIncome);
        this.proponentIsMain = Boolean.parseBoolean(proponentIsMain);
    }
}