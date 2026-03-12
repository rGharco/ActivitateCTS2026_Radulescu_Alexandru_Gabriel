package ro.ase.cts.main;

import ro.ase.cts.clase.MijlocTransport;
import ro.ase.cts.factory.FabricaMijTransport;
import ro.ase.cts.factory.Tipuri;

public class Main {
    static void main(String[] args) {
        FabricaMijTransport depou = new FabricaMijTransport();
        MijlocTransport autobuz = depou.getMijlocTransport(Tipuri.AUTOBUZ, 10, "B31CTS");
        MijlocTransport tramvai = depou.getMijlocTransport(Tipuri.TRAMVAI, 20, "B32CTS");
        MijlocTransport troleibuz = depou.getMijlocTransport(Tipuri.TROLEIBUZ, 20, "B33CTS");

        autobuz.afiseazaDescriere();
        tramvai.afiseazaDescriere();
        troleibuz.afiseazaDescriere();
    }
}
