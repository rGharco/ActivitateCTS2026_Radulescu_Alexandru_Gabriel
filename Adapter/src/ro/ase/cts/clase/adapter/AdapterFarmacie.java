package ro.ase.cts.clase.adapter;

import ro.ase.cts.clase.spital.Medicament;

public class AdapterFarmacie extends ro.ase.cts.clase.farmacie.Medicament {
    private Medicament medicament;

    public AdapterFarmacie(Medicament medicament) {
        super(medicament.getNume());
        this.medicament = medicament;
    }

    @Override
    public void cumparaMedicament() {
        this.medicament.achizitioneazaMedicament();
    }
}
