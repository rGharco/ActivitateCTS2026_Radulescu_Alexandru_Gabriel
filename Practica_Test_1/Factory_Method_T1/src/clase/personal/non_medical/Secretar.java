package clase.personal.non_medical;

import clase.PersonalSpital;

public class Secretar extends PersonalSpital {
    public Secretar(String nume, int varsta) {
        super(nume, varsta);
    }

    @Override
    public void vorbeste() {
        System.out.println("Sunt un secretar");
    }
}
