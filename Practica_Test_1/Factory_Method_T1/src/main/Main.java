package main;

import clase.PersonalSpital;
import factory.AbstractFactory;
import factory.FactoryPersonalMedical;
import factory.TipMedical;

public class Main {
    static void main(String[] args) {
        AbstractFactory medicalFactory = new FactoryPersonalMedical();
        PersonalSpital medic =  medicalFactory.getPersonal(TipMedical.BRANCARDIER, "Mihai", 23);

        medic.vorbeste();
    }
}
