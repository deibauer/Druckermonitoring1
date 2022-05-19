package Verwaltung;

public class Drucker {

    private int raumNr;
    private String druckername;
    private String ipAddresse;
    public Drucker(int raumNr, String druckername, String ipAddresse){
        this.raumNr = raumNr;
        this.druckername = druckername;
        this.ipAddresse = ipAddresse;
    }

    public int getRaumNr() {
        return raumNr;
    }

    public void setRaumNr(int raumNr) {
        this.raumNr = raumNr;
    }

    public String getDruckername() {
        return druckername;
    }

    public void setDruckername(String druckername) {
        this.druckername = druckername;
    }

    public String getIpAddresse() {
        return ipAddresse;
    }

    public void setIpAddresse(String ipAddresse) {
        this.ipAddresse = ipAddresse;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Drucker{");
        sb.append("raumNr=").append(raumNr);
        sb.append(", druckername='").append(druckername).append('\'');
        sb.append(", ipAddresse='").append(ipAddresse).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
