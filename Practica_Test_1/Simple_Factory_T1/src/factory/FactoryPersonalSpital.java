package factory;

import clase.Asistent;
import clase.Brancardier;
import clase.Medic;
import clase.PersonalSpital;

public class FactoryPersonalSpital {
    public PersonalSpital getPersonal(TipPersonal tip, String nume, int varsta) {
        if (tip == TipPersonal.BRANCARDIER) return new Brancardier(nume, varsta);
        if (tip == TipPersonal.MEDIC) return new Medic(nume, varsta);
        if (tip == TipPersonal.ASISTENT) return new Asistent(nume, varsta);

        return null;
    }
}
