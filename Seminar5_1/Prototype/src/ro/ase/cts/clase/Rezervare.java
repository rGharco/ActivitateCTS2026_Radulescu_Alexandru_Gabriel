package ro.ase.cts.clase;

public class Rezervare implements RezervarePrototype{
    private String numeClient;
    private int oraRezervare;
    private int ziuaRezervarii;
    private String numarTelefon;

    public Rezervare(String numeClient, int oraRezervare, int ziuaRezervarii, String numarTelefon) {
        if (numeClient.length() > 1) {
            this.numeClient = numeClient;
        }
        else {
            this.numeClient = "Ion";
        }

        if (oraRezervare < 23 && oraRezervare > 9) {
            this.oraRezervare = oraRezervare;
        }
        else {
            this.oraRezervare = 9;
        }

        if (ziuaRezervarii < 30) {
            this.ziuaRezervarii = ziuaRezervarii;
        }
        else {
            this.ziuaRezervarii = 1;
        }

        if (numarTelefon.length() == 10) {
            this.numarTelefon = numarTelefon;
        }
        else {
            this.numarTelefon = "0799999999";
        }
    }

    private Rezervare() {
    }

    public void setZiuaRezervarii(int ziuaRezervarii) {
        if (ziuaRezervarii < 30) {
            this.ziuaRezervarii = ziuaRezervarii;
        }
        else {
            this.ziuaRezervarii = 1;
        }
    }

    public void setOraRezervare(int oraRezervare) {
        if (oraRezervare < 23 && oraRezervare > 9) {
            this.oraRezervare = oraRezervare;
        }
        else {
            this.oraRezervare = 9;
        }
    }

    @Override
    public RezervarePrototype clone() {
        Rezervare clone = new Rezervare();
        clone.numeClient = this.numeClient;
        clone.oraRezervare = this.oraRezervare;
        clone.numarTelefon = this.numarTelefon;
        clone.ziuaRezervarii = this.ziuaRezervarii;

        return clone;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", oraRezervare=").append(oraRezervare);
        sb.append(", ziuaRezervarii=").append(ziuaRezervarii);
        sb.append(", numarTelefon='").append(numarTelefon).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
