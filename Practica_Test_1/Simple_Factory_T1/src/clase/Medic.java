package clase;

public class Medic extends PersonalSpital{
    public Medic(String nume, int varsta) {
        super(nume, varsta);
    }

    @Override
    public void vorbeste() {
        System.out.println("Sunt un medic");
    }
}
