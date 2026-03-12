package ro.ase.cts.factory;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.MijlocTransport;
import ro.ase.cts.clase.Tramvai;
import ro.ase.cts.clase.Troleibuz;

public class FabricaMijTransport {
    public MijlocTransport getMijlocTransport(Tipuri tip, int nrRoti, String nrInmatriculare) {
        if (tip == Tipuri.AUTOBUZ) return new Autobuz(nrInmatriculare, nrRoti);

        if (tip == Tipuri.TROLEIBUZ) return new Troleibuz(nrInmatriculare, nrRoti);

        if (tip == Tipuri.TRAMVAI) return new Tramvai(nrInmatriculare, nrRoti);

        return null;
    }
}
