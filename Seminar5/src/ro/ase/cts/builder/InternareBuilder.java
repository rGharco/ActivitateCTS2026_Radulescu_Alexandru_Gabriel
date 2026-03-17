package ro.ase.cts.builder;

public class InternareBuilder implements AbstractBuilder{
    private Internare internare;

    public InternareBuilder(String nume) {
        this.internare = new Internare(false,false,false,false,nume);
    }

    @Override
    public Internare build() {
        return this.internare;
    }

    @Override
    public AbstractBuilder setNumePacient(String nume) {
        this.internare.setNumePacient(nume);
        return this;
    }

    @Override
    public AbstractBuilder setPatRabatabil(boolean valoare) {
        this.internare.setPatRabatabil(valoare);
        return this;
    }

    @Override
    public AbstractBuilder setAreHalat(boolean valoare) {
        this.internare.setHalatInterior(valoare);
        return this;
    }

    @Override
    public AbstractBuilder setArePapuci(boolean valoare) {
        this.internare.setPapuciCamera(valoare);
        return this;
    }

    @Override
    public AbstractBuilder setAreMicDejun(boolean valoare) {
        this.internare.setMicDejunInclus(valoare);
        return this;
    }
}
