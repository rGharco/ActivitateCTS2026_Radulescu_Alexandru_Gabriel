package ro.ase.cts.clase;

public class Student {
    private ModSustinere modSustinere;

    public Student(ModSustinere modSustinere) {
        this.modSustinere = modSustinere;
    }

    public Student() {
        this.modSustinere = new ProbaGrila();
    }

    public void setModSustinere(ModSustinere modSustinere) {
        this.modSustinere = modSustinere;
    }

    public void examinare() {
        this.modSustinere.sustinereExamen();
    }
}
