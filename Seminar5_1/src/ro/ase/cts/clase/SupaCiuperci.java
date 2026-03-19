package ro.ase.cts.clase;

public class SupaCiuperci extends Supa{
    public SupaCiuperci(double pret, double gramaj) {
        super(pret, gramaj);
    }

    @Override
    public void afisare() {
        StringBuilder sb = new StringBuilder();
        sb.append("Supa de ciuperci are ").append(super.toString());
        System.out.println(sb);
    }
}
