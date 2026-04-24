package ro.ase.cts.main;

import ro.ase.cts.clase.Medic;
import ro.ase.cts.clase.Pacient;
import ro.ase.cts.clase.ReceptieSpital;
import ro.ase.cts.clase.Salon;

public class Main {
    static void main(String[] args) {
        Pacient pacient = new Pacient("Adriana",8);
        Medic medic=new Medic();
        Salon salon=new Salon();

        if(medic.areTrimitere(pacient))
        {
            int patLiber= salon.getPatLiber();
            if(patLiber!=-1)
            {
                System.out.println(" Pacientul "+pacient.getNume() +" va fi internat in patul " + patLiber);
                salon.ocupaPat(patLiber);
            }

        }
        Pacient pacient2 = new Pacient("Catalin",2);
        Pacient pacient3 = new Pacient("Paula",6);
        Pacient pacient4 = new Pacient("Mariana",10);

        ReceptieSpital receptieSpital=new ReceptieSpital(medic,salon);
        receptieSpital.interneazaPacient(pacient2);
        receptieSpital.interneazaPacient(pacient3);
        receptieSpital.interneazaPacient(pacient4);

    }
}