package main;

import clase.AbstractBuilder;
import clase.Rezervare;

public class Main {
    static void main(String[] args) {
        AbstractBuilder builderRezervare = new Rezervare.RezervareBuilder("Mirel", 2);
        Rezervare rez1 = ((Rezervare.RezervareBuilder) builderRezervare).setAreDecorareMasa(true).setAreLocGeam(true).build();

        System.out.println(rez1 .toString());
    }
}
