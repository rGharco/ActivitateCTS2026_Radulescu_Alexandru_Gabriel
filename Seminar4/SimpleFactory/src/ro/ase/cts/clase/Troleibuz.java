package ro.ase.cts.clase;

public class Troleibuz extends MijlocTransport{
    public Troleibuz(String nrInmatriculare, int numarRoti) {
        super(nrInmatriculare, numarRoti);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder builder = new StringBuilder();
        builder.append("Troleibuzul are nr roti: ").append(super.numarRoti);
        builder.append(" Nr Imatriculare: ").append(super.nrInmatriculare);

        System.out.println(builder.toString());
    }
}
