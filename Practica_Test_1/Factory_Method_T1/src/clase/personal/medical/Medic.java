package clase.personal.medical;

import clase.PersonalSpital;

public class Medic extends PersonalSpital {
    public Medic(String nume, int varsta) {
        super(nume, varsta);
    }

    @Override
    public void vorbeste() {
        System.out.println("Sunt un medic");
    }
}
