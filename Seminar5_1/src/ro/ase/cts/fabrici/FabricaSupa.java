package ro.ase.cts.fabrici;

import ro.ase.cts.clase.FelMancare;
import ro.ase.cts.clase.Supa;
import ro.ase.cts.clase.SupaCiuperci;
import ro.ase.cts.clase.SupaLegume;
import ro.ase.cts.enums.TipMancare;
import ro.ase.cts.enums.TipSupa;

public class FabricaSupa implements FabricaAbstracta{


    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, double pret, double gramaj) {
        if (tipMancare == TipSupa.LEGUME) {
            return new SupaLegume(pret, gramaj);
        }
        else if (tipMancare == TipSupa.CIUPERCI) {
            return new SupaCiuperci(pret, gramaj);
        }

        return null;
    }

    @Override
    public FelMancare getFelMancare(TipMancare tipMancare, double pret, double gramaj, int calorii) {
        return this.getFelMancare(tipMancare, pret, gramaj);
    }
}
