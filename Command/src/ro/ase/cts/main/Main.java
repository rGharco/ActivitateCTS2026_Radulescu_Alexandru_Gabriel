package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.Comanda;
import ro.ase.cts.clase.Operator;
import ro.ase.cts.clase.Plecare;

public class Main {
    static void main(String[] args) {
        Operator operator = new Operator();
        Autobuz autobuz1 = new Autobuz("Mercedes");
        Comanda comanda1 = new Plecare(autobuz1, 2);
        Comanda comanda2 = new Plecare(autobuz1, 4);
        Comanda comanda3 = new Plecare(autobuz1, 12);

        operator.adaugaComanda(comanda1);
        operator.adaugaComanda(comanda2);
        operator.adaugaComanda(comanda3);

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
    }
}
