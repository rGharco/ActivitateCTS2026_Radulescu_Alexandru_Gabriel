package factory;

import clase.PersonalSpital;
import clase.personal.medical.Asistent;
import clase.personal.medical.Brancardier;
import clase.personal.medical.Medic;

public class FactoryPersonalMedical implements AbstractFactory{
    @Override
    public PersonalSpital getPersonal(ITipMedical tip, String nume, int varsta) {
        if (tip == TipMedical.BRANCARDIER) return new Brancardier(nume, varsta);
        if (tip == TipMedical.MEDIC) return new Medic(nume, varsta);
        if (tip == TipMedical.ASISTENT) return new Asistent(nume, varsta);

        return null;
    }
}
