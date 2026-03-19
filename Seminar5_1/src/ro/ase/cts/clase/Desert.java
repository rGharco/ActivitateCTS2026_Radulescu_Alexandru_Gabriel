package ro.ase.cts.clase;

public abstract class Desert implements FelMancare{
    protected double pret;
    protected double gramaj;
    protected int calorii;

    public Desert(double pret, double gramaj, int calorii) {
        this.pret = pret;
        this.gramaj = gramaj;
        this.calorii = calorii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Desert{");
        sb.append("pret=").append(pret);
        sb.append(", gramaj=").append(gramaj);
        sb.append(", calorii=").append(calorii);
        sb.append('}');
        return sb.toString();
    }
}
