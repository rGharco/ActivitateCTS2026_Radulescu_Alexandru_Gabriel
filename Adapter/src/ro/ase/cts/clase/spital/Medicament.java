package ro.ase.cts.clase.spital;

public class Medicament {
    private String nume;
    private float pret;

    public Medicament(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public void achizitioneazaMedicament() {
        if (prezintaReteta()) {
            System.out.println("Am achizitionat medicamentul: " + this.nume +  " are pret " + this.pret);
            return;
        }

        System.out.println("Nu a fost prezentata reteta!");
    }

    public boolean prezintaReteta() {
        return this.nume.length() >= 10;
    }

    public String getNume() {
        return nume;
    }
}
