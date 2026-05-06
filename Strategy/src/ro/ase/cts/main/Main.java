package ro.ase.cts.main;

import ro.ase.cts.clase.*;

public class Main {
    static void main(String[] args) {
        ModSustinere scrisa = new ProbaScrisa();
        ModSustinere grila = new ProbaGrila();
        ModSustinere oral = new ProbaOral();
        Student student1 = new Student(oral);

        student1.examinare();
        student1.setModSustinere(scrisa);
        student1.examinare();
    }
}
