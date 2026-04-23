package clase;

public abstract class PersonalSpital {
    protected String nume;
    protected int varsta;

    public PersonalSpital(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public abstract void vorbeste();
}
