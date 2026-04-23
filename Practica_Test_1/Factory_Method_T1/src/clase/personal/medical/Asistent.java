package clase.personal.medical;

import clase.PersonalSpital;

public class Asistent extends PersonalSpital {
    public Asistent(String nume, int varsta) {
        super(nume, varsta);
    }

    @Override
    public void vorbeste() {
        System.out.println("Sunt un asistent");
    }
}
