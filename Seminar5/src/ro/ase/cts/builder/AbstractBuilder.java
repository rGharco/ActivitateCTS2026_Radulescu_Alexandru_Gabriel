package ro.ase.cts.builder;

public interface AbstractBuilder {
    Internare build();
    AbstractBuilder setNumePacient(String nume);
    AbstractBuilder setPatRabatabil(boolean valoare);
    AbstractBuilder setAreHalat(boolean valoare);
    AbstractBuilder setArePapuci(boolean valoare);
    AbstractBuilder setAreMicDejun(boolean valoare);

}
