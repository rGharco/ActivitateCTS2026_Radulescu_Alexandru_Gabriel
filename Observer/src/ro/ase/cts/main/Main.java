package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.Calator;
import ro.ase.cts.clase.CalatorAbonat;
import ro.ase.cts.clase.MijlocTransport;

public class Main {
    static void main(String[] args) {
        Calator calator = new CalatorAbonat("Gabi");
        Calator calator2 = new CalatorAbonat("Gigel");
        Calator calator3 = new CalatorAbonat("Mihai");
        Calator calator4 = new CalatorAbonat("Dan");

        MijlocTransport autobuz1 = new Autobuz("20");
        autobuz1.adaugareAbonat(calator);
        autobuz1.adaugareAbonat(calator2);
        autobuz1.adaugareAbonat(calator3);

        autobuz1.notificareCalator("autobuzul a plecat de pe linia ");
        autobuz1.pleaceDinDepou();

        autobuz1.adaugareAbonat(calator4);
        autobuz1.ramaneBlocatInTrafic();
    }
}
