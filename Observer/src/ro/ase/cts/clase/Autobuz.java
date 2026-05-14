package ro.ase.cts.clase;

public class Autobuz extends MijlocTransport{
    public Autobuz(String nrLinie) {
        super(nrLinie);
    }

    @Override
    public void pleaceDinDepou() {
        String mesaj = "Autobuzul de pe linia " + super.nrLinie + " pleace din depou!";
        notificareCalator(mesaj);
    }

    @Override
    public void ramaneBlocatInTrafic() {
        String mesaj = "Autobuzul de pe linia " + super.nrLinie + " nu poate sa ajunga deoarece a ramas blocat in trafic!";
        notificareCalator(mesaj);
    }
}
