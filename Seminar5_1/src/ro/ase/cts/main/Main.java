package ro.ase.cts.main;

import ro.ase.cts.clase.FelMancare;
import ro.ase.cts.clase.SupaCiuperci;
import ro.ase.cts.enums.TipDesert;
import ro.ase.cts.enums.TipSupa;
import ro.ase.cts.fabrici.FabricaAbstracta;
import ro.ase.cts.fabrici.FabricaDesert;
import ro.ase.cts.fabrici.FabricaSupa;

public class Main {
    static void main(String[] args) {
        FabricaDesert fabricaDesert = new FabricaDesert();
        FabricaSupa fabricaSupa = new FabricaSupa();

        FelMancare supaCiuperci = fabricaSupa.getFelMancare(TipSupa.CIUPERCI, 20.0, 300.0);
        FelMancare supaLegume = fabricaSupa.getFelMancare(TipSupa.LEGUME, 22.0, 300.0);
        FelMancare papanasi = fabricaDesert.getFelMancare(TipDesert.PAPANASI, 30.0, 300.0, 300);
        FelMancare clatite = fabricaDesert.getFelMancare(TipDesert.CLATITE, 30.0, 250.0);

        clatite.afisare();
        papanasi.afisare();
        supaCiuperci.afisare();
        supaLegume.afisare();
    }
}