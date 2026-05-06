package ro.ase.cts.clase;

public class Plecare implements Comanda{
    private Autobuz autobuz;
    private int linie;

    public Plecare(Autobuz autobuz, int linie) {
        this.autobuz = autobuz;
        this.linie = linie;
    }

    @Override
    public void pleacaInCursa() {
        autobuz.pleacePeTraseu(this.linie);
    }
}
