package ro.ase.cts.clase;
import ro.ase.cts.clase.Statie;

public interface MijlocDeTransport {
    void opresteInStatie(Statie statie);
    public int getNrPasageri();
    public TipCursa getTipCursa();
}