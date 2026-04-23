package clase.personal.non_medical;

import clase.PersonalSpital;

public class Registrator extends PersonalSpital {
    public Registrator(String nume, int varsta) {
        super(nume, varsta);
    }

    @Override
    public void vorbeste() {
        System.out.println("Sunt un registrator");
    }
}
