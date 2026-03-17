package ro.ase.cts.builder2;

import ro.ase.cts.builder.AbstractBuilder;
import ro.ase.cts.builder2.Internare2;

public class InternareBuilder2 implements AbstractBuilder2 {
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciCamera;
    private boolean halatInterior;

    public InternareBuilder2() {
        this.patRabatabil = false;
        this.micDejunInclus = false;
        this.papuciCamera = false;
        this.halatInterior = false;
    }

    @Override
    public Internare2 build(String nume) {
        return new Internare2(this.patRabatabil, this.micDejunInclus, this.papuciCamera,this.halatInterior,nume);
    }

    @Override
    public AbstractBuilder2 setPatRabatabil(boolean valoare) {
        this.patRabatabil = valoare;
        return this;
    }

    @Override
    public AbstractBuilder2 setAreHalat(boolean valoare) {
        this.halatInterior = valoare;
        return this;
    }

    @Override
    public AbstractBuilder2 setArePapuci(boolean valoare) {
        this.papuciCamera = valoare;
        return this;
    }

    @Override
    public AbstractBuilder2 setAreMicDejun(boolean valoare) {
        this.micDejunInclus = valoare;
        return this;
    }
}
