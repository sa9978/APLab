public class Disease {
    private Drug drug;
    private String tashkhis;

    public Disease(Drug drug, String tashkhis) {
        this.drug = drug;
        this.tashkhis = tashkhis;
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    public String getTashkhis() {
        return tashkhis;
    }

    public void setTashkhis(String tashkhis) {
        this.tashkhis = tashkhis;
    }
}
