package ro.ase.cts.main;

import ro.ase.cts.builder.AbstractBuilder;
import ro.ase.cts.builder.Internare;
import ro.ase.cts.builder.InternareBuilder;
import ro.ase.cts.builder2.AbstractBuilder2;
import ro.ase.cts.builder2.Internare2;
import ro.ase.cts.builder2.InternareBuilder2;

public class Main {
    static void main(String[] args) {
        Internare internare1 = new Internare();
        internare1.setNumePacient("Gigel");
        internare1.setPatRabatabil(true);
        System.out.println(internare1);

        AbstractBuilder builder = new InternareBuilder("Gigel");
        Internare internare2 = builder.setPatRabatabil(true).build();
        Internare internare3 = builder.setNumePacient("Viorel").setArePapuci(true).build();

        System.out.println(internare2);
        System.out.println(internare3);

        AbstractBuilder2 builder2 = new InternareBuilder2();
        builder2.setAreMicDejun(true);
        Internare2 internare4 = builder2.build("Georgica");
        Internare2 internare5 = builder2.build("Gigel");

        internare5.setHalatInterior(true);
    }
}