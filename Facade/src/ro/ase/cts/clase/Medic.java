package ro.ase.cts.clase;

public class Medic {
    public boolean areTrimitere(Pacient pacient)
    {
        return pacient.getGravitateStare()>5;
    }
}