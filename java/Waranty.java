import java.util.*;
public class Waranty{

    public String warrantyId;
    public String warrantyValue;
    public String warrantyProvince;

    public Waranty(String warrantyId, String warrantyValue, String warrantyProvince) {

        this.warrantyId = warrantyId;
        this.warrantyValue = warrantyValue;
        this.warrantyProvince = warrantyProvince;
    }

    public String getString(){
        return warrantyId + "," + warrantyValue + "," + warrantyProvince;
    }
}
