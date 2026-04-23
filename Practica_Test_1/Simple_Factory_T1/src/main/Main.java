package main;

import clase.PersonalSpital;
import factory.FactoryPersonalSpital;
import factory.TipPersonal;

public class Main {
    static void main(String[] args) {
        FactoryPersonalSpital factory = new FactoryPersonalSpital();
        PersonalSpital medic = factory.getPersonal(TipPersonal.MEDIC, "Mihai", 23);
        medic.vorbeste();
    }
}