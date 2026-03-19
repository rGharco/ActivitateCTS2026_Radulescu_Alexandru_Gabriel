package ro.ase.cts.fabrici;

import ro.ase.cts.clase.FelMancare;
import ro.ase.cts.enums.TipMancare;

public interface FabricaAbstracta {
    FelMancare getFelMancare(TipMancare tipMancare, double pret, double gramaj);
    FelMancare getFelMancare(TipMancare tipMancare, double pret, double gramaj, int calorii);
}
