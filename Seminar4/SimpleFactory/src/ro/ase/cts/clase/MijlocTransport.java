package ro.ase.cts.clase;

public abstract class MijlocTransport {
    protected int numarRoti;
    protected String nrInmatriculare;

    public MijlocTransport(String nrInmatriculare, int numarRoti) {
        this.nrInmatriculare = nrInmatriculare;
        this.numarRoti = numarRoti;
    }

    public abstract void afiseazaDescriere ();
}
