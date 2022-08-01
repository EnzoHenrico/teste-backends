public class Proponent{

    public String proponentId;
    public String proponentName;
    public Integer proponentAge;
    public Float proponentMonthlyIncome;
    public Boolean proponentIsMain;

    public Proponent(String proponentId, String proponentName, String proponentAge, String proponentMonthlyIncome, String proponentIsMain) {

        this.proponentId = proponentId;
        this.proponentName = proponentName;
        this.proponentAge = Integer.parseInt(proponentAge);
        this.proponentMonthlyIncome = Float.parseFloat(proponentMonthlyIncome);
        this.proponentIsMain = Boolean.parseBoolean(proponentIsMain);
    }

    public String getString(){
        return proponentId + "," + proponentAge + "," + proponentMonthlyIncome;
    }
}