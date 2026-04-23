package clase;

public class Brancardier extends PersonalSpital{
    public Brancardier(String nume, int varsta) {
        super(nume, varsta);
    }

    @Override
    public void vorbeste() {
        System.out.println("Sunt un brancardier");
    }
}
