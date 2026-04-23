package ro.ase.cts.main;

import ro.ase.cts.clase.adapter.AdapterFarmacie;
import ro.ase.cts.clase.spital.Medicament;

public class Main {
    public static void procurareMedicament(ro.ase.cts.clase.farmacie.Medicament medicament) {
        medicament.cumparaMedicament();
    }

    static void main(String[] args) {
        Medicament medSpital = new Medicament("Nurofen Super", 20.5f);
        medSpital.prezintaReteta();
        medSpital.achizitioneazaMedicament();

        ro.ase.cts.clase.farmacie.Medicament medFarmacie = new ro.ase.cts.clase.farmacie.Medicament("Ibuprofen Medicament");
        medFarmacie.cumparaMedicament();
        AdapterFarmacie medSpitalAdaptat = new AdapterFarmacie(medSpital);

        procurareMedicament(medSpitalAdaptat);
        procurareMedicament(medFarmacie);
    }
}
