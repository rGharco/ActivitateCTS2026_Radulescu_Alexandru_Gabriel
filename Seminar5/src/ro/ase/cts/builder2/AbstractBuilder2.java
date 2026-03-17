package ro.ase.cts.builder2;

import ro.ase.cts.builder.Internare;

public interface AbstractBuilder2 {
    Internare2 build(String nume);
    AbstractBuilder2 setPatRabatabil(boolean valoare);
    AbstractBuilder2 setAreHalat(boolean valoare);
    AbstractBuilder2 setArePapuci(boolean valoare);
    AbstractBuilder2 setAreMicDejun(boolean valoare);
}
