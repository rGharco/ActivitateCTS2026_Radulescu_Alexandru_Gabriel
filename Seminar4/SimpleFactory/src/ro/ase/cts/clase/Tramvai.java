package ro.ase.cts.clase;

public class Tramvai extends MijlocTransport{
    public Tramvai(String nrInmatriculare, int numarRoti) {
        super(nrInmatriculare, numarRoti);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder builder = new StringBuilder();
        builder.append("Tramvaiul are nr roti: ").append(super.numarRoti);
        builder.append(" Nr Imatriculare: ").append(super.nrInmatriculare);

        System.out.println(builder.toString());
    }
}
