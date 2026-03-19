package ro.ase.cts.main;

import ro.ase.cts.clase.Rezervare;
import ro.ase.cts.clase.RezervarePrototype;

public class Main {
    static void main(String[] args) {
        RezervarePrototype rez = new Rezervare("Gica", 20, 3, "0799999999");
        RezervarePrototype rez2 = rez.clone();

        ((Rezervare) rez2).setOraRezervare(12);
        ((Rezervare) rez2).setZiuaRezervarii(10);

        System.out.println(rez);
        System.out.println(rez2);
    }
}
