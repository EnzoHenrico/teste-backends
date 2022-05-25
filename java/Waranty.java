public class Waranty extends Event {

    public String warrantyId;
    public Float warrantyValue;
    public String warrantyProvince;

    public Waranty(String eventId, String eventAction, String eventTime, String warrantyId, String warrantyValue,
            String warrantyProvince) {

        super(eventId, eventAction, eventTime);

        this.warrantyId = warrantyId;
        this.warrantyValue = Float.parseFloat(warrantyValue);
        this.warrantyProvince = warrantyProvince;
    }
}
